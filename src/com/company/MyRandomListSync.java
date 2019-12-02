package com.company;
import java.util.*;

public class MyRandomListSync extends MyRandomList {


    MyRandomListSync(){
        super();
    }

    public synchronized void addNumber(){
        int elem;
        double tmp;
        int max = 10;
        int min = 0;
        tmp = (Math.random()*((max-min)+1))+min;
        elem =  (int) tmp;
        array.add(elem);
    }

    public synchronized void removeNumber(){

        Random indexRand = new Random();
        int index = indexRand.nextInt(array.size());
        array.remove(index);
    }

    public synchronized int calcZero(){
        int numNonZero = 0;
        ListIterator<Integer> itl = array.listIterator();
        while(itl.hasNext())
        {
            if(itl.next() != 0){
                numNonZero++;

            }
        }
        return numNonZero;
    }




}
