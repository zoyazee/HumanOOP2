package com.example.humanoop;

import android.util.Log;

public class Human {
    private String name;
    private int age;
    private int weight;

    public Human(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void eat() {
        Log.d("human","I am eating food");
    }

    public int eat(int weight) {
        weight = weight +  2;
        return Log.d("human","My new weight is " + weight + "Kg");
    }

    public void sleep() {
        Log.d("human","zzzzzzzzzzz");
    }

    public void sleep(int hours) {
        Log.d("human","I am sleeping for " + hours + "hours");
    }

    public void speak(String speech) {
        Log.d("human","Hey,Gentlemen");
    }

    public void birthday() {
        age = age + 1;
    }

    public int birthday(int age) {
        age = age + 4;
        return age;
    }
}



