package com.company;

public class Main {

    public static void main(String[] args) {
        Observable me=new Observable("Nurbolat");
        Observer obs=new Observer(me);
        me.addUser(obs);
        me.setScore(100);
        me.setScore(100);

    }
}
