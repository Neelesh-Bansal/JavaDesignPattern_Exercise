package q1;

public class Barbeque extends ToppingDecorator {
    Pizza pizza;
    Barbeque(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String info() {
        return pizza.info()+"->Barbeque ";
    }

    @Override
    public int cost() {
        return (90+pizza.cost());
    }
}
