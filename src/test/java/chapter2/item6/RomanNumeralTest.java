package chapter2.item6;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralTest {

    @Test
    @DisplayName("인스턴스 생성 많이해보기")
    void test1() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 5000000; i++) {
            boolean iv = RomanNumeral.isRomanNumeralBad("IV");
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    @Test
    @DisplayName("캐싱 기능 이용")
    void test2() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 5000000; i++) {
            boolean iv = RomanNumeral.isRomanNumeral("IV");
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    @Test
    @DisplayName("박싱 + 기본 타입 혼용")
    void test3() {
        long start = System.currentTimeMillis();
        Long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            sum += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    @Test
    @DisplayName("기본 타입만 사용")
    void test4() {
        long start = System.currentTimeMillis();
        long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            sum += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}