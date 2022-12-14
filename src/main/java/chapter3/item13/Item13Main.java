package chapter3.item13;

/**
 * 아이템13. clone 재정의는 주의해서 진행하라
 */
public class Item13Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Phone phone = new Phone(123455, "iphone");
        Phone clonePhone = phone.clone();

        System.out.println("phone = " + phone);
        System.out.println("clonePhone = " + clonePhone);
    }
}
