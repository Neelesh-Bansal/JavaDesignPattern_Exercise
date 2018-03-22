package q1;

public class ChickenFiesta implements Pizza {
    @Override
    public String info() {
        return "ChickenFiesta Pizza ";
    }

    @Override
    public int cost() {
        return 500;
    }
}
