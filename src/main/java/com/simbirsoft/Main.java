package com.simbirsoft;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Том", 18);

        cat.sayHelloToAnimal();
        cat.setNewName("Пушок");
        cat.feedAnimal();
        cat.checkWeight(cat.weight);

        Animal anotherCat = new Cat("Борис", 0);

        anotherCat.sayHelloToAnimal();
        anotherCat.feedAnimal();
        anotherCat.checkWeight(anotherCat.weight);


    }
}
