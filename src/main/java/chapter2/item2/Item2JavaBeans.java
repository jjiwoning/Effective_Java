package chapter2.item2;

/**
 * 자바빈즈 패턴 - 일관성이 깨지고 불변으로 만들 수 없다.
 */
public class Item2JavaBeans {

    // 매개변수들은 기본값으로 초기화된다.
    private int servingSize = -1; // 필수 -> 기본값 없음
    private int servings = -1; // 필수 -> 기본값 없음
    private int calories = 0;
    private int fat = 0;
    private int sodium = 0;
    private int carbohydrate = 0;

    // 기본 생성자
    public Item2JavaBeans() {
    }

    //setter
    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }
}
