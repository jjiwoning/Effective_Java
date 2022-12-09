package chapter2.item8;

public class SampleClass {

    int value = 0;

    public SampleClass(int value) {
        if (value <= 0) {
            throw new IllegalArgumentException("예외발생");
        }
        this.value = value;
    }

    private void privateCall() {
        System.out.println("call");
    }

    public void publicCall() {
        System.out.println("call");
    }

    @Override
    public String toString() {
        return "SampleClass{" +
                "value=" + value +
                '}';
    }
}
