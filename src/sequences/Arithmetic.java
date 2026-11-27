package sequences;

import exceptions.OutOfBoundsException;

public class Arithmetic extends Sequence {
    int a1;
    int r;

    public Arithmetic(int a1, int r) {
        super("Arithmetic (a_1=" + a1 + ", r=" + r + ")");
        this.a1 = a1;
        this.r = r;
        initialize();
    }

    @Override
    public int getSum(int n) throws OutOfBoundsException {
        return (2*a1+(n-1)*r)/2*n;
    }

    @Override
    void initialize() {
        int i = 1;
        int an;
        while ((an = a1 + (i - 1) * r) < max) {
            sequence.add(an);
            i++;
        }
    }
}
