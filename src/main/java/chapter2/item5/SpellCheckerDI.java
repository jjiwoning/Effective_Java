package chapter2.item5;

public class SpellCheckerDI {
    private final DictInterface dictInterface;

    public SpellCheckerDI(DictInterface dictInterface) {
        this.dictInterface = dictInterface;
    }
}
