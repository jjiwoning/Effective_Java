package chapter2.item8;

/**
 * 아이템8. finalizer와 cleaner 사용을 피하라
 */
public class Item8Main {
    public static void main(String[] args) throws Exception {
        // finalizer 공격
        try {
            new SampleAttackClass(-3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.gc();
        System.runFinalization();

        SampleClass sampleClass = SampleAttackClass.sampleClass;
        System.out.println(sampleClass.toString());

        //AutoCloseable
        System.out.println("===================================");
        try (SampleResource sampleResource = new SampleResource()) {
            sampleResource.call(3);
            sampleResource.call(5);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
