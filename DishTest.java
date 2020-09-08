package ru.mirea.lab3.Dish;

public class DishTest {
    public static void main(String[] args) {
        plate bowl = new plate("red", "ceramic", 0.4, true, "rectangle");
        bowl.toString();
        bowl.wash();
        System.out.println(bowl);
        Bottle cognac = new Bottle("brown", "glass", 1.0, false, false);
        cognac.toString();
        cognac.openUp();
        System.out.println(cognac);
    }
}
