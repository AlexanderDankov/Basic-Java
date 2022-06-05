package com.simbirsoft;

public class Cat extends Animal {

    public Cat(String name, int weight) {
        this.name = name;
        this.weight = weight;
        setType("Кот");
        setPredator(true);
        setTrainingItems(new String[]{"Бег за мячиком", "Прыжки на шторы", "Ловля хвоста"});
        setFeedingMenu(new String[]{"Рыба", "Курица", "Мясо", "Сухой корм"});
    }
}
