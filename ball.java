package com.company;

public class ball {
    private String origin;
    private String colour;
    private int radius;
    public ball(String n, String s, int a)
    {
        origin = n;
        colour = s;
        radius = a;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return String.format("origin: %s \n colour: %s \n radius: %s ", this.origin, this.colour, this.radius);
    }
}
