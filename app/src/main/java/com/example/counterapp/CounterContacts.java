package com.example.counterapp;

public class CounterContacts {

    interface CounterView {
        void updateCounter(int count);

        void greenText();
    }

    interface Presenter {
        void increment();

        void decrement();

        void attachView(CounterView counterView);

        void changeColor();


    }
}
