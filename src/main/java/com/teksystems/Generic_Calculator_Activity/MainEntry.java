package com.teksystems.Generic_Calculator_Activity;

public class MainEntry {
    public Integer add(int a, int b) {
        return a + b;
    }

    public Integer subtract(int a, int b) {
        if (a > b) {
            return a - b;
        } else {
            return b - a;
        }
    }

    public Integer multiply(int a, int b) {
        return a * b;
    }

    public Integer divide(int a, int b) {
        if (a > b && (a > 0 && b > 0)) {
            return a / b;
        } else if (b > a && a > 0){
            return b / a;
        }
        return null;
    }
}
