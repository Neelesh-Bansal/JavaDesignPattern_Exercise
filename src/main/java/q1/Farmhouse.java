package q1;

public class Farmhouse implements Pizza {
    @Override
    public String info() {
        return "Farmhouse Pizza ";
    }

    @Override
    public int cost() {
        return 400;
    }
}
