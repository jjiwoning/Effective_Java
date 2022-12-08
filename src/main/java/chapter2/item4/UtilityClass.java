package chapter2.item4;

public class UtilityClass {

    // 기본 생성자가 만들어지는 것을 막는다. (인스턴스화 방지)
    private UtilityClass() {
        throw new AssertionError();
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
