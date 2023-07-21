package com.examples.ennums;

public class AdditionClass extends ParentAddition { // Task to add number

    private int num1;
    private int num2;
    private int num3;
    private int tax = 1;

    public AdditionClass(int number1, int number2) { // constructor - task is to initialize the instance variable / properties of object
        this.num1 = number1;
        this.num2 = number2;
    }

    public AdditionClass(int number1, int number2, int number3) { // constructor - task is to initialize the instance variable / properties of object
        this.num1 = number1;
        this.num2 = number2;
        this.num3 = number3;
    }

    public int getResult() {
        return (this.num1 + this.num2 + this.num3) - super.tax;
//        return num1 + num2 + num3;
    }

    public static void main(String[] args) {
       AdditionClass cls = new AdditionClass(5, 6);
        System.out.println(cls.getResult());
    }




}
