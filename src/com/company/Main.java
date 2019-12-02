package com.company;

public class Main {

    public static void main(String[] args) {

	  /* MyRandomList list1 = new MyRandomList();
	    for(int i = 0; i < 5; i++){
	        list1.addNumber();
        }
	    MyWriteThread th1 = new MyWriteThread(list1, 0);
        MyReadThread th2 = new MyReadThread(list1);
        MyWriteThread th3 = new MyWriteThread(list1, 0);
        MyReadThread th4 = new MyReadThread(list1);

        th1.start();
        th2.start();
        th3.start();
        th4.start();*/


        MyRandomListSync list2 = new MyRandomListSync();
        for(int i = 0; i < 5; i++){
            list2.addNumber();
        }

        MyWriteThread th1 = new MyWriteThread(list2, 0);
        MyReadThread th2 = new MyReadThread(list2);
        MyWriteThread th3 = new MyWriteThread(list2, 0);
        MyReadThread th4 = new MyReadThread(list2);

        th1.start();
        th2.start();
        th3.start();
        th4.start();
        list2.show();
        System.out.println("Non null");
        System.out.println(list2.calcZero());
    }
}
