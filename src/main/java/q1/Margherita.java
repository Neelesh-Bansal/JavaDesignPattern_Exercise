package q1;

public class Margherita implements Pizza {

    @Override
    public String info() {
        return "Margherita Pizza ";
    }

    @Override
    public int cost() {
        return 450;
    }
}
