package chapter2.item5;

/**
 * 아이템5. 자원을 직접 명시하지 말고 의존 객체 주입을 사용하라
 */
public class Item5Main {
    public static void main(String[] args) {
        DicImpl1 dicImpl1 = new DicImpl1();
        DicImpl2 dicImpl2 = new DicImpl2();

        SpellCheckerDI spellCheckerDI1 = new SpellCheckerDI(dicImpl1);
        SpellCheckerDI spellCheckerDI2 = new SpellCheckerDI(dicImpl2);
    }
}
