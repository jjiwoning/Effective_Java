package chapter2.item9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 아이템9. try-finally 보다는 try-with-resources를 활용하라
 */
public class Item9Main {
    public static void main(String[] args) {

    }

    // try-finally를 사용한 예시
    static String firstLineOfFileUsingFinally(String path) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(path));
        try {
            return br.readLine();
        } finally {
            br.close();
        }
    }

    // try-with-resources를 사용한 예시
    static String firstLineOfFile(String path, String defaultVal) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        } catch (IOException e) {
            return defaultVal;
        }
    }
}
