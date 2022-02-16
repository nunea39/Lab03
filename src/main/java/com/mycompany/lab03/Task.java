/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab03;

import java.text.ParseException;
import java.time.Duration;
import java.time.Instant;

/**
 *
 * @author soblab
 */
public class Task {
    
public int linearSearch (int nmLst[], int n, int x){
    
    int i = 0, location;
    
    while ( i<=n && x != nmLst[i]){
        i= i + 1;
    }
    
    if (i <= n ){       
        location = i;
    }
    
    else {
        location = 0; 
    }
    
    return -1;
}
public static int binarySearch (int search, int[] array){
    
    int start = 0;
    int end = array.length -1;
    
    while(start <= end){
        
        int middle = (start + end) /2;
        
        if (search < array [middle]){
            end = middle -1;
        }
        
        if (search > array[middle]){
            start = middle +1;
        }
        
        if (search == array[middle]){
            return middle;
        }
    }
    return -1;
}

void bubbleSort(int[] a, int size ) {
    int outer, inner, temp;
    
    for (outer = size-1; outer > 0; outer--) { // counting down

        for (inner = 0; inner < outer; inner++) { // bubbling up

            if (a[inner] > a[inner + 1]) { // if out of order...

                temp = a[inner]; // ...then swap

                a[inner] = a[inner + 1];

                a[inner + 1] = temp;

            }

        }

    }
}

void selectionSort(int[] a , int size) {
    int outer, inner, min;

    for (outer = 0; outer < size

            - 1; outer++) {

        min = outer;

        for (inner = outer + 1; inner < size ; inner++) {

            if (a[inner] < a[min]) {

                min = inner;

            }

        }

        int temp = a[outer];

        a[outer] = a[min];

        a[min] = temp;

    }
}

public static void main(String[] args) throws ParseException{
    
    Instant start = Instant.now();
    
    long i=0;
    while(i<100000000){
        i++;
    }
    Instant finish = Instant.now();
    
    long timeElapsed = Duration.between(start, finish).toMillis();
        System.out.println("time " + timeElapsed);
        
    
}

}
