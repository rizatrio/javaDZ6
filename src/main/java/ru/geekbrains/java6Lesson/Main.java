package ru.geekbrains.java6Lesson;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("cat1");
        Cat cat2 = new Cat("cat2");
        Cat cat3 = new Cat("cat3", 10, 5);
        Cat cat4 = new Cat("cat4", 100, 40);

        Dog dog1 = new Dog("dog1");
        Dog dog2 = new Dog("dog2", 100, 50);
        Dog dog3 = new Dog("dog3", 500, 200);

        cat4.run(15);
        cat4.runWithMaxDistance(200);
        cat4.swim(13);
        cat4.swimWithMaxDistance(20);

        dog3.run(120);
        dog3.runWithMaxDistance(30);
        dog3.swimWithMaxDistance(100);

        System.out.println("Количество животных " + Animal.count);
        System.out.println("Количество котов " + Cat.count);
        System.out.println("Количество собак " + Dog.count);
    }
}
