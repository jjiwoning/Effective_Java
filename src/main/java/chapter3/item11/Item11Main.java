package chapter3.item11;

import java.util.HashMap;
import java.util.Map;

/**
 * 아이템11. equals를 재정의하려거든 hashcode도 재정의하라
 */
public class Item11Main {
    public static void main(String[] args) {
        Map<PhoneNumber, String> map = new HashMap<>();
        map.put(new PhoneNumber(101), "제니");
        System.out.println(map.get(new PhoneNumber(101)));
    }
}
