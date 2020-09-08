package ru.mirea.pr3.Shapes;


    public class Circle extends Shape {

        protected double radius;

        public Circle() {
        }

        public Circle(double radius) {
            this.radius = radius;
        }

        public Circle(String color, boolean filled, double radius) {
            super(color, filled);
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        @Override
        public double getArea() {
            return Math.PI*radius*radius;
        }

        @Override
        public double getPerimeter() {
            return 2*Math.PI*radius;
        }

        @Override
        public String toString() {
            return String.format("Circle (colour = %s radius = %s sm)", getColor(), getRadius());
        }
    }
