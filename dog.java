package com.company;

public class dog {
    private String name;
    private String species;
    private int age;
    public dog(String n, String s, int a)
    {
        name = n;
        species = s;
        age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("name: %s \n species: %s \n age: %s", this.name, this.species, this.age);
    }
}
