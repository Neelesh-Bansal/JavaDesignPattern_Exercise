package q1;

public class FreshTomato extends ToppingDecorator{
    Pizza pizza;
FreshTomato(Pizza pizza){
    this.pizza=pizza;
}

    @Override
    public String info() {
        return pizza.info()+" ->FreshTomato ";
    }

    @Override
    public int cost() {
        return (50 + pizza.cost()) ;
    }
}
