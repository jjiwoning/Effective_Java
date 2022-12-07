package chapter2.item3;

/**
 * 정적 팩터리 방식의 싱글톤
 */
public class SingletonClass2 {
    private static final SingletonClass2 INSTANCE = new SingletonClass2();

    public static SingletonClass2 getInstance() {
        return INSTANCE;
    }

    private SingletonClass2() {
    }
}
