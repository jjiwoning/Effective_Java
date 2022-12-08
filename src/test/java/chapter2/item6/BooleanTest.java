package chapter2.item6;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BooleanTest {

    @Test
    @DisplayName("Boolean 확인")
    void test1() {
        Boolean bool = new Boolean("TRUE"); // bad
        Boolean bool2 = Boolean.valueOf("true"); // good

        Assertions.assertThat(bool).isTrue();
        Assertions.assertThat(bool2).isTrue();
    }
}
