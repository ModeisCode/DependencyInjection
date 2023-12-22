public class ChefGenerator implements Chef{

    Food food;

    public ChefGenerator(Food food) {
        this.food = food;
    }

    @Override
    public void prepareFood() {
        food.eat();
    }

}
