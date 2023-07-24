package com.example.constructor.parent_child2;

public class ParentConstr2 {
    String hairColor;
    int age;
    public ParentConstr2(String hairColor) {
        this.hairColor = hairColor;
        System.out.println("Parent args-constructor");
    }

    public ParentConstr2(String hairColor, int age) {
        this.hairColor = hairColor;
        this.age = age;
    }
}
