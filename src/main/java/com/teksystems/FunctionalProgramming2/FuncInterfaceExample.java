package com.teksystems.FunctionalProgramming2;

@FunctionalInterface
public interface FuncInterfaceExample {
    int sum(int a, int b); //a single abstract method

    // default method
    default int multiply(int a, int b) {
        return a * b;
    }
}
