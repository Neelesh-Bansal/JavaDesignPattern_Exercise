package q1;

public class Capsicum extends ToppingDecorator {

    Pizza pizza;
    Capsicum(Pizza pizza){
        this.pizza=pizza;
    }

    @Override
    public String info() {
        return pizza.info()+"->Capsicum ";
    }

    @Override
    public int cost() {
        return (80+pizza.cost());
    }
}
