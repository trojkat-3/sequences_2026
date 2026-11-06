package sequences;

public class Primes extends Sequence {

    private boolean isPrime(int p) {
        if (p < 2) {
            return false;
        }
        for (int i = 2; i * i <= p; i++) {
            if (p % i == 0) {
                return false;
            }
        }
        return true;
    }

    public Primes() {
        super("Primes");
        initialize();
    }

    @Override
    void initialize() {
        int p = 1;
        while (p <= MAX) {
            if (isPrime(p)) {
                sequence.add(p);
            }
            p++;
        }
    }
}
