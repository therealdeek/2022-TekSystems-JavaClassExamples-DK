package com.teksystems.FunctionalProgramming2;

public class Calculator {
    FuncInterfaceExample Fobj = new FuncInterfaceExample() {
        @Override
        public int sum(int a, int b) {
            return a + b;
        }
    };
}
