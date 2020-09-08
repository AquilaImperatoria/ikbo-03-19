package ru.mirea.lab3.Dish;

public class plate extends Dish {
    String shape;

    public plate(String colour, String material, double volume, boolean dirty, String shape) {
        super(colour, material, volume, dirty);
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "plate{" +
                "shape='" + shape + '\'' +
                ", colour='" + colour + '\'' +
                ", material='" + material + '\'' +
                ", volume=" + volume +
                ", dirty=" + dirty +
                '}';
    }
}
