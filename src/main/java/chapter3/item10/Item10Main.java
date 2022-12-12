package chapter3.item10;

import java.util.ArrayList;
import java.util.List;

/**
 * 아이템10. equals는 일반 규약을 지켜 재정의하라
 */
public class Item10Main {
    public static void main(String[] args) {
        System.out.println("==============대칭성===============");
        CaseInsensitiveString s1 = new CaseInsensitiveString("Hello");
        String s2 = "hello";
        System.out.println("s1.equals(s2) = " + s1.equals(s2));
        System.out.println("s2.equals(s1) = " + s2.equals(s1));

        List<CaseInsensitiveString> list = new ArrayList<>();
        list.add(s1);
        System.out.println("list.contains(s2) = " + list.contains(s2));

        System.out.println("==============추이성===============");
        ColorPoint p1 = new ColorPoint(1, 2, Color.RED);
        Point p2 = new Point(1, 2);
        ColorPoint p3 = new ColorPoint(1, 2, Color.BLUE);

        System.out.println("p1.equals(p2) = " + p1.equals(p2));
        System.out.println("p2.equals(p3) = " + p2.equals(p3));
        System.out.println("p1.equals(p3) = " + p1.equals(p3));
    }
}
