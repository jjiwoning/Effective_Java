package chapter2.item6;

/**
 * 아이템6. 불필요한 객체 생성을 피하라
 */
public class Item6Main {
    public static void main(String[] args) {
        String s = new String("bikini"); // 따라 하지 말 것;

        String s1 = "bikini";
        String s2 = "bikini";

        System.out.println(s == s1);
        System.out.println(s1 == s2);
    }
}
