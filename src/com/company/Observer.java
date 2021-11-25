package com.company;

public class Observer implements IObserver{
    private Observable observable;
    public Observer(Observable observable){
        setObservable(observable);
    }

    public Observable getObservable() {
        return observable;
    }

    public void setObservable(Observable observable) {
        this.observable = observable;
    }

    @Override
    public void update(String name, int score) {
        System.out.println("Now "+name+" have "+score);
    }
}
