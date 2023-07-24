package com.example.constructor;

public class Constructor2 {

    String n; // Instance variable

    public Constructor2() { // non-args
        System.out.println("Running Constructor2");
    }

    public Constructor2(String name) { // Purpose: To initialize the instance variables. Or, setup some data for the object.
        String n = "5"; // Local variable
        System.out.println("value of local n in constructor: " + n);// null
        System.out.println("value of instance n in constructor: " + this.n);// null
        this.n = name;
        System.out.println("Running Constructor2 With Argument: " + name);
    }

    public static void main(String[] args) {

        Constructor2 cons1;

        int i = 1;
        int j = 0;

        System.out.println("i is " + i + ", and j is " + j);

        cons1 = new Constructor2(); // Expected 1 argument but found 0.

        Constructor2 cons2 = new Constructor2("Name User");

        System.out.println(cons1.n); // null

        System.out.println(cons2.n); // Name User
    }
}
