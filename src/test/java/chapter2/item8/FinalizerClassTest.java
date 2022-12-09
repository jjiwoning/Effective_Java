package chapter2.item8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FinalizerClassTest {

    class SampleClass {
        FinalizerClass finalizerClass = new FinalizerClass();
        void run() {
            finalizerClass.call();
        }
    }

    @Test
    @DisplayName("finalize() 동작 확인")
    void test1() throws InterruptedException {
        for (int i = 0; i < 30; i++) {
            SampleClass sampleClass = new SampleClass();
            sampleClass.run();

            System.gc();
        }
    }
}