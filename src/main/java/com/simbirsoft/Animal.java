package com.simbirsoft;

public class Animal {
    protected String type;
    protected int weight;
    protected String name;
    protected boolean isPredator;
    protected String[] trainingItems = new String[3];
    protected String[] feedingMenu = new String[4];

    public void setType(String type) {
        this.type = type;
    }

    public void setPredator(boolean predator) {
        isPredator = predator;
    }

    public void setTrainingItems(String[] trainingItems) {
        this.trainingItems = trainingItems;
    }

    public void setFeedingMenu(String[] feedingMenu) {
        this.feedingMenu = feedingMenu;
    }

    public void sayHelloToAnimal() {
        System.out.println("Привет! Я " + this.type + ". И меня зовут " + this.name);
    }

    public void setNewName(String newName) {
        name = newName;
        System.out.println("Ты изменил мое имя на " + name);
    }

    public void feedAnimal() {
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

    public void animalTraining() {
        while (this.weight > 20) {
            for (String trainingItem : trainingItems) {
                this.weight -= 2;
                System.out.println("План тренировки: " + trainingItem + ". Теперь мой вес " + this.weight);
            }
        }
        checkWeight(this.weight);
    }

    public void checkWeight(int weight) {
        if (weight > 20) {
            System.out.println("Нужно срочно сбросить вес! Запускаем тренировку");
            animalTraining();
        } else {
            System.out.println("Все в порядке, питомец в отличной форме");
        }
    }


}
