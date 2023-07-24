package com.example.constructor.parent_child2;

public class ChildConstr2 extends ParentConstr2 {

//    public ChildConstr2() {
//        super("ParentConst");
//        System.out.println("ChildConstr2");
//    }

    String String;

    public ChildConstr2(String age) {
        super(age);
        this.String = age;
    }

    public static void main(String[] args) {


        // Case-3 - Parent has args constructor. And Child has no constructor. you call argument inside super(). // No Error.
        // Case-3 - Parent has arg constructor. And Child has arg-constructor. super() must be added inside child constructor // No Error.

        // If Parent Has No-arguments consturctor then child must also have a constructor.
        ChildConstr2 child = new ChildConstr2("sss");
    }
}
