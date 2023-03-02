package algos.day01;

import java.util.ArrayList;
import java.util.Arrays;

public class Basic13 {

// TODO: Print all the integers from 1 to 255.

public static void Basic1(){

    for(int i = 1; i <= 255; i++){
        System.out.println(i);
    }
}

// TODO: Print integers from 0 to 255, and with each integer print the sum so far.

public static void Basic2(){
    int sum = 0;
    for(int i = 1; i <= 255; i++){
        sum += i;
        System.out.println(i);
        System.out.println(sum);
    }
}

// TODO: Given an array, find and print its largest element.

public static void Basic3(int[] array){
        int max = array[0];
    for(int i = 0; i < array.length; i++){
        if(array[i] > max){
            max = array[i];
        }
    }
    System.out.println(max);
}

// TODO: Create an array with all the odd integers between 1 and 255 (inclusive).

public static void Basic4(){
    int[] oddArray = new int[256];
    for(int i = 0; i <= 255; i++){

    }
    System.out.println(Arrays.toString(oddArray));
}

public static void Basic4_2(){
    ArrayList<Integer> oddArray = new ArrayList<>();
    // System.out.println(Arrays.toString(oddArray));
    for(int i = 0; i <= 255; i++){
        if(i % 2 == 1){
            oddArray.add(i);
        }
    }
    System.out.println(oddArray);
}

// TODO: Given an array and a value Y, count and print the number of array values greater than Y.

// TODO: Given an array, print the max, min and average values for that array.
    
// TODO: Replace any negative array values with 'Dojo'.

// TODO: Print all odd integers from 1 to 255.

// TODO: Iterate through a given array, printing each value.

// TODO: Analyze an array’s values and print the average

// TODO: Square each value in a given array, returning that same array with changed values

// TODO: Return the given array, after setting any negative values to zero.

// TODO: Given an array, move all values forward by one index, dropping the first and leaving a '0' value at the end.


    
}
