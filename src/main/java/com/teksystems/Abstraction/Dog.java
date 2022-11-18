package com.teksystems.Abstraction;

public class Dog extends Animal{
    @Override
    public void animalEats() {

        System.out.println("This animal eats biscuits.");
    }

    @Override
    public void animalSound() {

        System.out.println("This animal barks.");
    }
}
