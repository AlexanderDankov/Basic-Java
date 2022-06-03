package com.simbirsoft;

public class Mouse extends Animal {
    public Mouse(String name, int weight) {
        type = "Мышь";
        isPredator = false;
        trainingItems = new String[]{"Бег от кота", "Круги в колесе", "Рытьё нор"};
        feedingMenu = new String[]{"Сыр", "Пшено", "Морковка", "Сухой корм"};
        this.name = name;
        this.weight = weight;
    }
}
