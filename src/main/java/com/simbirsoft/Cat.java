package com.simbirsoft;

public class Cat extends Animal {

    public Cat(String name, int weight) {
        type = "Кот";
        isPredator = true;
        trainingItems = new String[]{"Бег зя мячиком", "Прыжки на шторы", "Ловля хвоста"};
        feedingMenu = new String[]{"Рыба", "Курица", "Мясо", "Сухой корм"};
        this.name = name;
        this.weight = weight;
    }
}
