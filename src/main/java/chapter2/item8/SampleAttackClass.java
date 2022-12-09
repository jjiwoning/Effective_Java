package chapter2.item8;

public class SampleAttackClass extends SampleClass {

    static SampleClass sampleClass;

    public SampleAttackClass(int value) {
        super(value);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("call finalize");
        sampleClass = this;
    }
}
