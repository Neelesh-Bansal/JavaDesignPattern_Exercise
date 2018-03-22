package q1;

public class Jalapeno extends ToppingDecorator {
    Pizza pizza;
    Jalapeno(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String info() {
        return pizza.info()+"->Jalapeno ";
    }

    @Override
    public int cost() {
        return (70+pizza.cost());
    }
}
