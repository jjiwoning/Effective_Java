package chapter2.item5;

/**
 * 정적 유틸리티를 잘못 사용한 예 - 유연하지 않고 테스트하기 어려움
 */
public class SpellCheckerStaticUtility {
    private static final Dictionary dictionary = new Dictionary();

    // 객체 생성 방지
    private SpellCheckerStaticUtility() {
    }
}
