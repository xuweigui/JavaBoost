package com.windrift.algorithm;

public class Selection {
     /**
     * find the Kth biggest number in the n numbers
     */


        static int SIZE = 300000;
        static int k = SIZE/2;
        static int[] data = new int[SIZE];


    public static void main(String[] args) {
        
        int[] sort = new int[k];
        for (int i = 0; i < SIZE; i++) {
            
        }

    }


    private static void prepareData() {
       for (int i = 0; i < SIZE; i++) {
           data[i] = (int) (Math.random() * SIZE);
       }
    }
    
    private static class Data {
        int content;
        Data next;
        Data previous;
        
        public Data(int content, Data pre, Data next) {
            this.content = content;
            this.previous = pre;
            this.next = next;
        }
    }
}
