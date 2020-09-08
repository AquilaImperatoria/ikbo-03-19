package ru.mirea.lab3.Dish;

abstract class Dish {
    String colour;
    String material;
    double volume;
    boolean dirty;

    public Dish(String colour, String material, double volume, boolean dirty) {
        this.colour = colour;
        this.material = material;
        this.volume = volume;
        this.dirty = dirty;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public boolean isDirty() {
        return dirty;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }

    public void wash()
    {
        this.dirty = false;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "colour='" + colour + '\'' +
                ", material='" + material + '\'' +
                ", volume=" + volume +
                ", dirty=" + dirty +
                '}';
    }
}
