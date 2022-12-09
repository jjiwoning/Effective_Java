package chapter2.item8;

import java.lang.ref.Cleaner;

public class Room implements AutoCloseable{
    private static final Cleaner cleaner = Cleaner.create();

    private final Cleaner.Cleanable cleanable;

    private final State state;

    public Room(final int numJunkFiles) {
        this.state = new State(numJunkFiles);
        cleanable = cleaner.register(this, state); // Runnable 객체를 등록
    }

    // 청소가 필요한 자원 -> 절대로 Room을 참조하면 안된다. -> 순환참조가 되어 GC가 처리하지 못함
    private static class State implements Runnable {
        int numJunkPiles; // 청소할 대상

        public State(final int numJunkPiles) {
            this.numJunkPiles = numJunkPiles;
        }

        @Override
        public void run() {
            System.out.println("방청소");
            numJunkPiles = 0;
        }
    }

    @Override
    public void close() throws Exception {
        cleanable.clean();
    }
}
