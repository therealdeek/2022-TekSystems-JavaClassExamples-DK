package com.teksystems.Abstraction;

public class AbstractionMain {
    public static void main(String[] args) {
        System.out.println("========cat=========");

        Animal cat = new Cat();
        cat.animalEats();
        cat.animalSound();

        System.out.println("========dog==========");
        Animal dog = new Dog();
        dog.animalEats();
        dog.animalSound();

        System.out.println("========pig==========");
        Animal pig = new Pig();
        pig.animalEats();
        pig.animalSound();



    }
}
