package chapter2.item3;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

class SingletonClassTest {

    @Test
    @DisplayName("싱글톤 확인 1")
    void test1() {
        SingletonClass1 singletonClass1 = SingletonClass1.INSTANCE;
        SingletonClass1 singletonClass2 = SingletonClass1.INSTANCE;

        Assertions.assertThat(singletonClass1).isSameAs(singletonClass2);
    }

    @Test
    @DisplayName("싱글톤 확인 2")
    void test2() {
        SingletonClass2 singletonClass1 = SingletonClass2.getInstance();
        SingletonClass2 singletonClass2 = SingletonClass2.getInstance();

        Assertions.assertThat(singletonClass1).isSameAs(singletonClass2);
    }

    @Test
    @DisplayName("리플렉션으로 공격해보기")
    void test3() throws Exception {
        SingletonClass2 singletonClass2 = SingletonClass2.getInstance();
        Constructor<SingletonClass2> getConstructor = (Constructor<SingletonClass2>) singletonClass2.getClass().getDeclaredConstructor();
        getConstructor.setAccessible(true);

        SingletonClass2 newSingletonClass2 = getConstructor.newInstance();

        Assertions.assertThat(singletonClass2).isNotSameAs(newSingletonClass2);
    }

    @Test
    @DisplayName("Supplier 사용")
    void test4() {
        Supplier<SingletonClass2> supplier = SingletonClass2::getInstance;
        SingletonClass2 singletonClass2 = supplier.get();
    }
}