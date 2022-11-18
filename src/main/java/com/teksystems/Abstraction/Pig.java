package com.teksystems.Abstraction;

public class Pig extends Animal{
    @Override
    public void animalSound() {

        System.out.println("The pig makes an oink sound.");
    }

    @Override
    public void animalEats() {

        System.out.println("The pig eats slop.");
    }
}
