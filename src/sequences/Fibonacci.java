package sequences;

import java.util.ArrayList;

public class Fibonacci extends Sequence {
    private int[] head=new int[2];

    public Fibonacci(int f0, int f1){
        super("Fibonacci sequence (f0="+f0+", f1="+f1+")");
        head[0]=f0;
        head[1]=f1;
        initialize();
    }

    public Fibonacci(){
        this(0,1);
    }

    private int fibonacci(int n, ArrayList<Integer> fib) {
        if (n < fib.size()) {
            return fib.get(n);
        }
        if (n <= 1) {
            return head[n];
        } else {
            return fibonacci(n - 1, fib) + fibonacci(n - 2, fib);
        }
    }

    @Override
    void initialize() {
        int i=0;
        int f;
        while ((f=fibonacci(i,sequence))<= max) {
            sequence.add(f);
            i++;
        }
    }
}
