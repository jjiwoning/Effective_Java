package chapter2.item3;

/**
 * 아이템3. private 생성자나 열거 타입으로 싱글톤임을 보증하라
 */
public class Item3Main {
    public static void main(String[] args) {

        SingletonClass1 singletonClass1 = SingletonClass1.INSTANCE;
        SingletonClass2 singletonClass2 = SingletonClass2.getInstance();
    }
}
