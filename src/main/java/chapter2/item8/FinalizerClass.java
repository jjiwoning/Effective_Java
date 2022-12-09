package chapter2.item8;

public class FinalizerClass {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("FinalizerClass.finalize()");
    }

    public void call() {
        System.out.println("FinalizerClass.call()");
    }
}
