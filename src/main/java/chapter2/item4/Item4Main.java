package chapter2.item4;

/**
 * 아이템4. 인스턴스화를 막으려거든 private 생성자를 사용하라
 */
public class Item4Main {
    public static void main(String[] args) {
        //UtilityClass utilityClass = new UtilityClass(); -> 인스턴스화 불가
        int a = 5;
        int b = 3;

        int sum = UtilityClass.sum(5, 3);
        System.out.println(sum);
    }
}
