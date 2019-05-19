package com.example.humanoop;

public class Anna extends Human {
    private int height;

    public Anna(String name, int age, int weight) {
        super(name, age, weight);
    }

    public Anna(String name, int age, int weight, int height) {
        super(name, age, weight);
        this.height = height;
    }
}
