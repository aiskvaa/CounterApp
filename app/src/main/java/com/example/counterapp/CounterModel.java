package com.example.counterapp;

public class CounterModel {
    int count = 0;

    void increment() {
        ++count;
    }

    void decrement() {
        --count;
    }

    public int getCount() {
        return count;
    }
}
