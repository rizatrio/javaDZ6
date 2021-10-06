package ru.geekbrains.java6Lesson;

public class Dog extends Animal{
    public static int count;

    public Dog(String name) {
        super(name);
        count++;
    }

    public Dog(String name, int maxRunDistance, int maxSwimDistance) {
        super(name, maxRunDistance, maxSwimDistance);
        count++;
    }

    @Override
    protected void run(int distance) {
        System.out.println(name + " пробежал " + distance + " м.");
    }

    @Override
    protected void swim(int distance) {
        System.out.println(name + " проплыл " + distance + " м.");
    }

    @Override
    protected void runWithMaxDistance(int distance) {
        if (distance < maxRunDistance) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " пробежал " + maxRunDistance + " м.");
        }
    }

    @Override
    protected void swimWithMaxDistance(int distance) {
        if (distance < maxSwimDistance) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " проплыл " + maxSwimDistance + " м.");
        }
    }
}