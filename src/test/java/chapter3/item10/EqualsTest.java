package chapter3.item10;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.assertj.core.api.Assertions.*;

class EqualsTest {

    A a1 = new A("hello", 10);
    A a2 = new A("hello", 10);
    A a3 = new A("hello", 10);

    @Test
    @DisplayName("반사성")
    void test1() {
        assertThat(a1.equals(a1)).isTrue();
    }

    @Test
    @DisplayName("대칭성")
    void test2() {
        assertThat(a2.equals(a1)).isTrue();
        assertThat(a1.equals(a2)).isTrue();
    }

    @Test
    @DisplayName("추이성")
    void test3() {
        assertThat(a1.equals(a2)).isTrue();
        assertThat(a2.equals(a3)).isTrue();
        assertThat(a1.equals(a3)).isTrue();
    }

    @Test
    @DisplayName("일관성")
    void test4() {
        for (int i = 0; i < 10; i++) {
            assertThat(a1.equals(a2)).isTrue();
        }
    }

    @Test
    @DisplayName("null 아님")
    void test5() {
        assertThat(a1.equals(null)).isFalse();
    }

    class A {
        String s;
        int n;

        public A(String s, int n) {
            this.s = s;
            this.n = n;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            A a = (A) o;
            return n == a.n && Objects.equals(s, a.s);
        }

        @Override
        public int hashCode() {
            return Objects.hash(s, n);
        }
    }

}
