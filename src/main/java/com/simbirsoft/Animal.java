package com.simbirsoft;

public class Animal {
    int weight;
    String name;
    boolean isPredator;

    public Animal(int weight, String name, boolean isPredator) {
        this.weight = weight;
        this.name = name;
        this.isPredator = isPredator;
    }

    int feedAnimal() {
        if(isPredator) {
            this.weight += 2;
        } else {
            this.weight += 1;
        }
        return weight;
    }
}
