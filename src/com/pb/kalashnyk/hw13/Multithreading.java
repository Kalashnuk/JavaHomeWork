package com.pb.kalashnyk.hw13;

import java.util.*;

class Producer implements Runnable{

    private final List list;
    private final int size;

    public Producer(List list, int size) {
        this.list = list;
        this.size = size;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (list) {
                while (list.size() == size) {
                    try {
                        System.out.println("Producer is waiting ...");
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                int x = new Random().nextInt(111);
                System.out.println("Producer produces: " + x + " items");
                list.add(x);
                list.notifyAll();
            }
        }

    }
}
class Consumer implements Runnable {

    private  final List list;
    private final int size;

    public Consumer(List list, int size) {
        this.list = list;
        this.size = size;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (list) {
                while (list.isEmpty()) {
                    System.out.println("Consumer is waiting ...");
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Consumer consumed: " + list.remove(0) +" items");
                list.notifyAll();
            }
        }

    }
}
public class Multithreading {

    public static void main(String[] args) {

        List list = new ArrayList();
        int size = 3;

        Thread producer = new Thread(new Producer(list, size), " Producer");
        Thread consumer = new Thread(new Consumer(list, size), " Consumer");

        producer.start();
        consumer.start();
    }
}