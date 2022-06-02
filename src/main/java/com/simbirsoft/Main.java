package com.simbirsoft;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal(10,"Tom", false);

        cat.feedAnimal();

        System.out.println(cat.weight);

    }
}
