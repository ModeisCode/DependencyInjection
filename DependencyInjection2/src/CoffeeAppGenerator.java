public class CoffeeAppGenerator implements CoffeeApp{

    CoffeeMachiene coffeeMachiene;

    CoffeeAppGenerator() {

    }

    public void setCoffeeMachiene(CoffeeMachiene coffeeMachiene) {
        this.coffeeMachiene = coffeeMachiene;
    }

    @Override
    public void app() {
        System.out.println("started app.");
    }
}
