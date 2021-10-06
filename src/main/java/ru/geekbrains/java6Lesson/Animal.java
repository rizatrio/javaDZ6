package ru.geekbrains.java6Lesson;


public abstract class Animal {
    protected String name;
    protected final int maxRunDistance;
    protected final int maxSwimDistance;
    public static int count;

    public Animal(String name) {
        this(name, 0, 0);
        this.name = name;
    }

    public Animal(String name, int maxRunDistance, int maxSwimDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        count++;
    }

    public static int getCount() {
        return count;
    }

    protected abstract void run(int distance);
    protected abstract void swim(int distance);
    protected abstract void runWithMaxDistance(int distance);
    protected abstract void swimWithMaxDistance(int distance);

}