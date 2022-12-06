package chapter2.item1;

/**
 * 아이템1. 생성자 대신 정적 팩터리 메서드를 고려하라
 */
public class Item1 {
    private int num;
    private String name;

    //기존의 방식 -> public으로 생성자를 열어서 쓴다.
    public Item1(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public Item1() {
    }

    //정적 팩터리 메서드
    public static Item1 getInstance(int num, String name) {
        Item1 item1 = new Item1();
        item1.num = num;
        item1.name = name;
        return item1;
    }

    public static Item1 getInheritance(int num, String name) {
        Item1 item = new Item1Inheritance();
        item.num = num;
        item.name = name;
        return item;
    }
}
