package com.simbirsoft;

public class Parrot extends Animal{
    public Parrot(String name, int weight) {
        this.name = name;
        this.weight = weight;
        setType("Попугай");
        setPredator(false);
        setTrainingItems(new String[]{"Грызть жердь", "Бегать в клетке", "Летать по дому"});
        setFeedingMenu(new String[]{"Семечки", "Яблоко", "Морковка", "Пшено"});
    }
}
