package com.simbirsoft;

public class Animal {
    String type;
    int weight;
    String name;
    boolean isPredator;
    String[] trainingItems = new String[3];
    String[] feedingMenu = new String[4];


    void sayHelloToAnimal() {
        System.out.println("Привет! Я " + this.type + ". И меня зовут " + this.name);
    }

    void setNewName(String newName) {
        name = newName;
        System.out.println("Ты изменил мое имя на " + name);
    }

    void feedAnimal() {
        for (String menu : feedingMenu) {
            if (isPredator) {
                this.weight += 5;
                System.out.println("Сейчас у меня на обед: " + menu + ". Мой вес теперь " + this.weight);
            } else {
                this.weight += 2;
                System.out.println("Сейчас у меня на обед: " + menu + ". Мой вес теперь " + this.weight);
            }
        }

    }

    void animalTraining() {
        while (this.weight > 20) {
            for (String trainingItem : trainingItems) {
                this.weight -= 2;
                System.out.println("План тренировки: " + trainingItem + ". Теперь мой вес " + this.weight);
            }
        }
        checkWeight(this.weight);
    }

    void checkWeight(int weight) {
        if (weight > 20) {
            System.out.println("Нужно срочно сбросить вес! Запускаем тренировку");
            animalTraining();
        } else {
            System.out.println("Все в порядке, питомец в отличной форме");
        }
    }


}
