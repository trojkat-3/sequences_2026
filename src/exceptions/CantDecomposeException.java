package exceptions;

public class CantDecomposeException extends Exception {
    public CantDecomposeException(int n, String name){
        super("I can't decompose "+n+" as a sum of: "+name);
    }
}
