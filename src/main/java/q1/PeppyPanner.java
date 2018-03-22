package q1;

public class PeppyPanner implements Pizza{

    @Override
    public String info() {
        return "Penny Panner pizza ";
    }

    @Override
    public int cost() {
        return 350;
    }
}
