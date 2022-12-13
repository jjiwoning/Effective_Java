package chapter3.item12;

import java.util.HashMap;
import java.util.Map;

/**
 * 아이템12. toString을 항상 재정의하라
 */
public class Item12Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "member1");
        map.put(2, "member2");
        System.out.println(map);

        PhoneNumber phoneNumber = new PhoneNumber(123493);
        System.out.println(phoneNumber);

        System.out.println(Grade.A);
    }
}
