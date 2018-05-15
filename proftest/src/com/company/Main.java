package com.company;

import java.util.Random;

public class Main {
    Random r = new Random();

    public static void main(String[] args) {
        Main test = new Main();
    }

    public Main(){
        String arrayStrings[] = {"This", "is", "A", "Test", "to", "chEck", "if", "BegIns", "wiTH", "CAPS"};
        int arrayInts[] = new int[10];
        for(int i = 0; i<10; i++) {
            arrayInts[i] = r.nextInt(100);
        }
        this.printArray(arrayInts);
        System.out.println("");
        for(int j = 0; j<arrayStrings.length; j++) {
            System.out.println(arrayStrings[j] + ": " + this.beginsWithCaps(arrayStrings[j]));
        }
    }

    public void printArray(int array[]){
        for(int i = 0; i<array.length;i++){
            System.out.print(array[i] + " ");
        }
    }

    public boolean beginsWithCaps(String testString){
        return Character.isUpperCase(testString.charAt(0));
    }
}
