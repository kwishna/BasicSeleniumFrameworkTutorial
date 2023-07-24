package com.example.constructor.parent_child;

public class ChildConstr extends ParentConstr {

    int x;

    public ChildConstr(int something) {
        super(); // super means parent.

        this.x = something;

        /*
        super.instance_var <---- calling parent instance variable.
        super.some_method() <---- calling parent method.
        super() <---- calling parent constructor. // THIS MUST BE THE FIRST STATEMENT INSIDE THE CHILD CONSTRUCTOR.
         */
    }

    public static void main(String[] args) {


        // Case-1 - Parent has a no-args constructor. And Child has no constructor. // No Error.
        // Case-2 - Parent has a no-arg constructor. And Child has arg-constructor. super() must be added inside child constructor // No Error.

        // If Parent Has No-arguments consturctor then child must also have a constructor.
        ChildConstr child = new ChildConstr(1);
    }
}
