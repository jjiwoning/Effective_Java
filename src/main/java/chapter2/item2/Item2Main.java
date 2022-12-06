package chapter2.item2;

/**
 * 아이템2. 생성자에 매개변수가 많다면 빌더를 고려하라
 */
public class Item2Main {
    public static void main(String[] args) {
        System.out.println("Item2");
        System.out.println("========빌더 패턴 사용========");
        Item2Builder item2Builder = new Item2Builder.Builder(5, 5)
                .calories(100).sodium(35).carbohydrate(27).build();

        System.out.println("========자바빈즈 패턴 사용========");
        Item2JavaBeans item2JavaBeans = new Item2JavaBeans();
        item2JavaBeans.setCalories(500);
        item2JavaBeans.setServings(100);
        item2JavaBeans.setServings(50);

        System.out.println("========Lombok 빌더 패턴 사용========");
        Item2BuilderLombok item2BuilderLombok = Item2BuilderLombok.builder()
                .servings(40)
                .servingSize(50)
                .fat(50)
                .build();
    }
}
