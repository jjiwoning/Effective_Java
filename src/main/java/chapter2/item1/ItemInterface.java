package chapter2.item1;

public interface ItemInterface {

    // 하위 타입 객체를 반환할 수 있는 능력이 있다.
    static ItemInterface of(String name) {
        if (name.equals("impl")) {
            return new ItemImpl();
        } else if (name.equals("impl2")) {
            return new ItemImpl2();
        }
        throw new IllegalArgumentException();
    }
}
