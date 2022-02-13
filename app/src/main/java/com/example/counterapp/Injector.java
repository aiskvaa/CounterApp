package com.example.counterapp;

public class Injector {
    public static CounterPresenter attachPresenter() {
        return new CounterPresenter();
    }
}
