package chapter2.item5;

/**
 * 싱글톤을 잘못 사용한 예 - 유연하지 않고 테스트하기 어렵다.
 */
public class SpellCheckerSingleton {
    private final Dictionary dictionary = new Dictionary();

    private SpellCheckerSingleton() {

    }

    public static SpellCheckerSingleton INSTANCE = new SpellCheckerSingleton();
}
