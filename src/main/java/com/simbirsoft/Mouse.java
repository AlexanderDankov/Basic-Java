package com.simbirsoft;

public class Mouse extends Animal {
    public Mouse(String name, int weight) {
        this.name = name;
        this.weight = weight;
        setType("Мышь");
        setPredator(false);
        setTrainingItems(new String[]{"Бег от кота", "Круги в колесе", "Рытьё нор"});
        setFeedingMenu(new String[]{"Сыр", "Пшено", "Морковка", "Сухой корм"});
    }
}
