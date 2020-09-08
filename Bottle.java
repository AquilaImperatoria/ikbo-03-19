package ru.mirea.lab3.Dish;

public class Bottle extends Dish{
    boolean isOpen;

    public Bottle(String colour, String material, double volume, boolean dirty, boolean isOpen) {
        super(colour, material, volume, dirty);
        this.isOpen = isOpen;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
    public void openUp()
    {
        this.isOpen = true;
    }

    @Override
    public String toString() {
        return "Bottle{" +
                "isOpen=" + isOpen +
                ", colour='" + colour + '\'' +
                ", material='" + material + '\'' +
                ", volume=" + volume +
                ", dirty=" + dirty +
                '}';
    }
}
