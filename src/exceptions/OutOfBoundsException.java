package exceptions;

public class OutOfBoundsException extends Exception {
    public OutOfBoundsException(int n, String name){
        super("Argument [n: "+n+"] exceeds the allowed range for sequence: "+name);
    }
}
