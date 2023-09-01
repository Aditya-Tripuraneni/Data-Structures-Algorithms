import java.lang.reflect.Array;
import java.util.*;

/* 
! -------------------------------------- Notes --------------------------------------
* This is an effecient searching algorithm that work well with large data sets that are sorted. 
* Binary search can be used with datasets that are sorted in ascending or descending order


? BINARY SEARCH: 
* Time Complexity: log(n) --> n is number of elements in data set 
* Space Complexity: O(1) --> Doesn't use additional space

! DISADVANTAGE OF Binary Search: 
* Data set must be sorted
* Works beter with larger data sets as opposed to super smaller data sets

! -----------------------------------------------------------------------------------

*/

/*
 ! Applications: 
 */


public class Main {
    public static void main(String[] args) {
        System.out.println("First line to be printed in the Saearching Algorithms main java file. ");

        // String[] array = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K"}; 
        // String target = "I"; 

        int[] array = generateSortedArray(2_000_000); 
        int target = 2_000_000; 

        long startTime = System.nanoTime();

        int index = binarySearch(target, array);

        long deltaTime = System.nanoTime() - startTime; 


        System.out.println("Binary Search target was found at index: " + index + " in time span of " + deltaTime + " ns");

        startTime = System.nanoTime();

        int linearIndex = linearSearch(target, array); 

        deltaTime = System.nanoTime() - startTime; 

        System.out.println("Linear search target was found at index: " + linearIndex + " in time span of " + deltaTime + " ns");




        

    }

    public static int binarySearch(String target, String[] array)
    {

        int left = 0; int right = array.length -1; 
        int tries = 1;

        while (left <= right){ 
            int middle = (left + right)/2; 

            if (array[middle].equals(target)) {
                System.out.println("Tries for binary search: " + tries);
                return middle; 
            }

            else if (array[middle].compareTo(target) < 0){ //if our middle element is less than our target
                left = middle + 1; 
                tries++;

            }

            else{ //only other case would be if our array[middle] is bigger than target, then chop of right half and search mpre on left
                right = middle - 1;
                tries++;
            }
        }



        return -1; //Cannot find the target
    }

    public static int binarySearch(int target, int[] array)
    {

        int left = 0; int right = array.length -1; 
        int tries = 1;

        while (left <= right){ 
            int middle = (left + right)/2; 

            if (array[middle] == target) {
                System.out.println("Tries for binary search: " + tries);
                return middle; 
            }

            else if (array[middle] < target){ //if our middle element is less than our target
                left = middle + 1; 
                tries++;

            }

            else{ //only other case would be if our array[middle] is bigger than target, then chop of right half and search mpre on left
                right = middle - 1;
                tries++;
            }
        }



        return -1; //Cannot find the target
    }

    public static int linearSearch(String target, String[] array){
    
        for (int i = 0; i < array.length; i ++)
        {
            if (array[i].equals(target)) 
            {
                System.out.println("Tries for linear search: " + i);
                return i; 
            }
        }

        return -1; 
    }

    public static int linearSearch(int target, int[] array){
    
        for (int i = 0; i < array.length; i ++)
        {
            if (array[i] == target) 
            {
                System.out.println("Tries for linear search: " + i);
                return i; 
            }
        }

        return -1; 
    }

    public static int[] generateSortedArray(int size) {
        int[] array = new int[size];
        int startValue = 1; // Starting value for the sorted array

        for (int i = 0; i < size; i++) {
            array[i] = startValue;
            startValue++;
        }

        return array;
    }
}

