package chapter2.item6;

import java.util.regex.Pattern;

public class RomanNumeral {

    // 잘못된 사용법 : String.matches는 내부에서 Pattern 인스턴스를 생성한다.
    static boolean isRomanNumeralBad(String s) {
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})" + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    }

    // 좋은 사용법 : Pattern 인스턴스를 캐싱해둔다.
    private static final Pattern ROMAN = Pattern.compile("^(?=.)M*(C[MD]|D?C{0,3})" + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

    static boolean isRomanNumeral(String s) {
        return ROMAN.matcher(s).matches();
    }
}
