public class Main {
    public static void main(String[] args) {
        Food pizzaFood = new Burger();
        Chef chef = new ChefGenerator(pizzaFood);
        chef.prepareFood();
    }
}