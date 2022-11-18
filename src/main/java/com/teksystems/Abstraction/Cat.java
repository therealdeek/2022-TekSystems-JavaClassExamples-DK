package com.teksystems.Abstraction;

public class Cat extends Animal implements AnimalInterface {
    @Override
    public void animalEats() {

        System.out.println("The cat eats fish.");
    }

    @Override
    public void animalSound() {

        System.out.println("The cat meows.");
    }

    @Override
    public void animalLocation() {

    }

    @Override
    public void animalName() {

    }

    @Override
    public void someFunction() {

    }
}
