package com.company;
import java.util.*;

public class MyRandomList {
   LinkedList<Integer> array;

   MyRandomList(){
       array = new LinkedList<>();
   }

   public void addNumber(){
       int elem;
       double tmp;
       int max = 10;
       int min = 0;
       tmp = (Math.random()*((max-min)+1))+min;
       elem =  (int) tmp;
       array.add(elem);
   }

   public void removeNumber(){
       int index;
       double tmp;
       int max = array.size();
       int min = 0;
       tmp = (Math.random()*((max-min)+1))+min;
       index = (int) tmp;
       array.remove(index);
   }

   public int calcZero(){
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

   void show(){
       System.out.println(array);
   }

}
