package com.company;

public class MyReadThread extends Thread {
    private MyRandomList array;
    MyReadThread(MyRandomList newArray){
        array = newArray;
    }

    @Override
    public void run() {
        for(int i = 0; i< 50; i++) {
            array.calcZero();
        }
    }
}
