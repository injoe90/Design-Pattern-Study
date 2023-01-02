package Drink;

public abstract class DrinkBeverage {
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
    abstract void brew();


    abstract void addCondiments();

    void boilWater() { System.out.println("물 끓이는 중..."); }

    private void pourInCup() { System.out.println("컵에 따르는 중..."); }
}
