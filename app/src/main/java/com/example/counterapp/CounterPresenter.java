package com.example.counterapp;

public class CounterPresenter implements CounterContacts.Presenter{

    CounterModel counterModel;
    CounterContacts.CounterView counterView;


    public CounterPresenter() {
        counterModel = new CounterModel();
    }

    @Override
    public void increment() {
       counterModel.increment();
       counterView.updateCounter(counterModel.getCount());
    }

    @Override
    public void decrement() {
        counterModel.decrement();
        counterView.updateCounter(counterModel.getCount());
    }

    @Override
    public void attachView(CounterContacts.CounterView counterView) {
        this.counterView = counterView;
    }

    @Override
    public void changeColor() {
        if (counterModel.getCount()== 10){
            counterView.greenText();
        }
    }
}
