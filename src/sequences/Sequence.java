package sequences;

import java.util.ArrayList;

abstract public class Sequence {

    protected int max = 1000;

    public void setMax(int max) {
        this.max = max;
        sequence.clear();
        initialize();
    }

    protected String name;
    protected ArrayList<Integer> sequence=new ArrayList<>();

    public Sequence(String name){
        this.name=name;
    }
    abstract void initialize();

    public String getName() {
        return name;
    }
    public ArrayList<Integer> getSequence() {
        return sequence;
    }
}
