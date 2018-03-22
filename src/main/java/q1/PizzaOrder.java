package q1;

public class PizzaOrder {
    public static void main(String[] args) {
        Pizza pizza1 = new PeppyPanner();
        pizza1 = new FreshTomato(pizza1);
        pizza1 = new FreshTomato(pizza1);
        pizza1 = new Capsicum(pizza1);
        System.out.println(pizza1.cost());
        System.out.println(pizza1.info());


    }
}
