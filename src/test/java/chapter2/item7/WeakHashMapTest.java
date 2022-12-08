package chapter2.item7;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.WeakHashMap;

class WeakHashMapTest {

    @Test
    @DisplayName("WeakHashMap 테스트")
    void test1() {
        Map<Object, Object> weakMap = new WeakHashMap<>();

        Object key1 = new Object();
        Object key2 = new Object();
        Object key3 = new Object();

        Object value1 = new Object();
        Object value2 = new Object();
        Object value3 = new Object();

        weakMap.put(key1, value1);
        weakMap.put(key2, value2);
        weakMap.put(key3, value3);

        Assertions.assertThat(weakMap.size()).isEqualTo(3);

        key1 = null;

        System.gc();

        weakMap.entrySet().stream().forEach(e -> System.out.println(e));
        Assertions.assertThat(weakMap.size()).isEqualTo(2);
    }
}
