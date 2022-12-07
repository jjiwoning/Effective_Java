package chapter2.item3;

/**
 * public static final 필드 방식의 싱글톤
 */
public class SingletonClass1 {
    public static final SingletonClass1 INSTANCE = new SingletonClass1();

    private SingletonClass1() {

    }
}
