package com.pb.kalashnyk.hw10;

import java.io.IOException;

public class NumBox <T extends Number> {
    T [] numbers;

    public NumBox(int size) {
        numbers = (T[]) new Number[size];
    }

    public void add(int index, T num) throws ArrayIndexOutOfBoundsException {
        if(index > numbers.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        else numbers[index] = num;
    }

    public T get(int index){
        return numbers[index];
    }

    public int getSize(){
        return numbers.length;
    }

    public int length(){
        int count = 0;
        for(T i : numbers){
            if(!(i == null)){
                count++;
            } else count+=0;
        }
        return count;
    }

    public double average(){
        double average = (sum()/length());
        return average;
    }

    public double sum() {
        double sum = 0;
        for(T i : numbers){
            if(i == null){
                sum+=0;
            } else sum+=i.doubleValue();
        }
        return sum;
    }

    public T max(){
        T maxi = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i].doubleValue() > maxi.doubleValue()) {
                maxi = numbers[i];
            }
        }
        return maxi;
    }

    static void delimiter() {
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    public static void main(String[] args) throws IOException {
        NumBox<Integer> objInt = new NumBox<Integer>(5);

        try {
            objInt.add(0, 1);
            objInt.add(1, 2);
            objInt.add(2, 7);
            objInt.add(3, 5);
            objInt.add(4, 6);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The array is full. Array length :  " + objInt.getSize());
            e.printStackTrace();
        }
        System.out.println("Integer print: ");
        delimiter();
        System.out.println("Print element index [5]: "+objInt.get(4));
        System.out.println("Print elements: "+objInt.length());
        System.out.println("Print average: "+objInt.average());
        System.out.println("Print sum of elements: "+objInt.sum());
        System.out.println("Print maximum element: "+objInt.max());
        delimiter();

        NumBox<Float> objFloat = new NumBox<>(8);

        try {
            objFloat.add(0, 1.30F);
            objFloat.add(1, 2.20F);
            objFloat.add(2, 5.40F);
            objFloat.add(3, 4.10F);
            objFloat.add(4, 3.60F);
            objFloat.add(5, 7.80F);
            objFloat.add(6, 9.50F);
            objFloat.add(7, 8.20F);
        } catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println("The array is full. Array length :  " + objFloat.getSize());
            e2.printStackTrace();
        }
        System.out.println("Float print: ");
        delimiter();
        System.out.println("Print element index 4: "+objFloat.get(3));
        System.out.println("Print elements: "+objFloat.length());
        System.out.println("Print average: "+objFloat.average());
        System.out.println("Print sum of elements: "+objFloat.sum());
        System.out.println("Print maximum element: "+objFloat.max());

    }
}