package com.examples.pages;

public class IceCreamMaker {

    public String flavor;
    public String material;
    public String color;

    @Override
    public String toString() {
        return "IceCreamMaker{" +
                "flavor='" + flavor + '\'' +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public IceCreamMaker(String _flavor, String _material, String _color) {
        flavor = _flavor;
        this.material = _material;
        this.color = _color;
    }

    public static void main(String[] args) {
        IceCreamMaker iceCream = new IceCreamMaker("Vanilla", "Milk", "yellow");
        System.out.println(iceCream.toString());
    }
}
