package ru.mirea.pr10.ComplexNums;


public interface ComplexAbstractFactory {
    Complex createComplex();
    Complex createComplex(int real, int image);
}