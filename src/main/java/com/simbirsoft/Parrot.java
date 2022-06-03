package com.simbirsoft;

public class Parrot extends Animal{
    public Parrot(String name, int weight) {
        type = "Попугай";
        isPredator = false;
        trainingItems = new String[]{"Грызть жердь", "Бегать в клетке", "Летать по дому"};
        feedingMenu = new String[]{"Семечки", "Яблоко", "Морковка", "Пшено"};
        this.name = name;
        this.weight = weight;
    }
}
