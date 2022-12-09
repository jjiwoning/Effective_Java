package chapter2.item8;

public class SampleResource implements AutoCloseable{

    boolean isClosed = false;

    @Override
    public void close() throws Exception {
        isClosed = true;
        System.out.println("SampleResource.close");
    }

    public void call(int value) {
        if (isClosed) {
            throw new IllegalStateException("close object");
        }
        if (value == 0) {
            throw new IllegalArgumentException("invalid value");
        }
        System.out.println("SampleResource.call");
    }

    @Override
    protected void finalize() throws Throwable {
        if (!isClosed) {
            close();
        }
    }
}
