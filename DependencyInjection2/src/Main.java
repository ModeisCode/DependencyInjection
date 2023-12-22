public class Main {
    public static void main(String[] args) {
    CoffeeMachiene coffeeMachiene = new BasicCoffeeMachiene();
    CoffeeAppGenerator coffeeAppGenerator = new CoffeeAppGenerator();
    coffeeAppGenerator.setCoffeeMachiene(coffeeMachiene);
    CoffeeApp coffeeApp = coffeeAppGenerator;
    ((CoffeeAppGenerator) coffeeApp).coffeeMachiene.start();
    }
}