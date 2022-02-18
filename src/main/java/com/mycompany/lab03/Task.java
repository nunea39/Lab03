
package com.mycompany.lab03;

import java.text.ParseException;
import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

/**
 * Classwork
 *
 * @author Andry Nunez
 */
public class Task {
    
private int linearSearch (int nmLst[], int n, int x){
    
    int i = 0, location = 0;
    
    while ( i<=n && x!= nmLst[i]){
        
        i= i + 1;
    }
        if (i <= n ){       
             return location = i;
        }
    
        else {
            location = 0; 
        }
    
    return -1;
}
private int binarySearch (int search, int[] array){
    
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

private static void bubbleSort(int[] a, int size ) {
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

private static void selectionSort(int[] a , int size) {
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

        
    Scanner scnr = new Scanner(System.in);
    int [] arr = {15, 17, 9, 2, 5, 19, 1};
    Task task1 = new Task();
    
    // Prints the original array list
    System.out.print ("Original array: \n");
    for (int i =0; i < arr.length; i++){
        System.out.print(arr[i] + " ");
    }
    System.out.println("\n");
    
    
    // Sorts the original array list using bubble sorting and prints sorted list
    bubbleSort(arr, 7);
    System.out.print ("Bubble sort: \n");
    for (int i =0; i < arr.length; i++ ){
    System.out.print(arr[i] + " ");
    }   
    System.out.println();
    
   
    // Sorts the original array list using selection sorting and prints sorted list
    selectionSort(arr, 7);   
    System.out.print ("Selection sort: \n");
    for (int i =0; i < arr.length; i++ ){
    System.out.print(arr[i] + " ");
    }   
    System.out.println("\n");
    
    //Console will ask user for a value to search within the array
    System.out.println("Search for value ");
    int x = scnr.nextInt();
    
    //Binary Search will look for the entered value
    int result = task1.binarySearch(x, arr);
    if (result == -1){ // if value is not found system will say not found 
        
       System.out.println("Binary Search not found ..");  
       
    }
    else { // if the value is found system will display the index it was found in
        System.out.println("Binary Search found in index " + result);
    }
    
    //Linear search will look for the entered value
    int result2 = task1.linearSearch(arr, 6, x);
    if (result2 == -1){ // if value is not found system will say not found 
        
       System.out.println("Linear Search not found .."); 
       
    }
    else { // if the value is found system will display the index it was found in
        System.out.println("Linear Search found in index " + result2);
    }
        
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
