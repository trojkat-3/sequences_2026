package sequences;

public class Integers extends Sequence {

    public Integers() {
        super("Integers");
        initialize();
    }

    @Override
    void initialize() {
        for (int i = 1; i <= MAX; i++) {
            sequence.add(i);
        }
    }
}
