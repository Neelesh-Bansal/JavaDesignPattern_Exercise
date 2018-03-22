package q1;

public class Paneer extends ToppingDecorator{
    Pizza pizza;
    Paneer(Pizza pizza){
        this.pizza=pizza;
    }

    @Override
    public String info() {
        return pizza.info()+"->Paneer ";
    }

    @Override
    public int cost() {
        return (60+pizza.cost());
    }
}
