package ru.mirea.pr10.ComplexNums;


public class Test {
    public static void main(String[] args) {
        Complex a = new Complex(35, 7);
        System.out.println(a);
        ComplexAbstractFactory b = new ConcreteFactory();
        Complex c = b.createComplex(123, 456);
        System.out.println(c);
        ConcreteFactory d = new ConcreteFactory();
        Complex f = d.createComplex(0, 1);
        System.out.println(f);
    }
}
