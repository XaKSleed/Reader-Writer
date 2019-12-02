package com.company;

public class MyWriteThread extends Thread {
    private MyRandomList array;
    private int threadType;

    MyWriteThread(MyRandomList newArray, int type){
        array = newArray;
        threadType = type;
    }

    @Override
    public void run() {

        if(threadType == 0){
            for(int i = 0; i < 50; i++) {
                threadAdd();
            }

        }
        else{
            threadRemove();
        }
    }

    private void threadAdd(){
        array.addNumber();
    }

    private void threadRemove(){
        array.removeNumber();
    }
}
