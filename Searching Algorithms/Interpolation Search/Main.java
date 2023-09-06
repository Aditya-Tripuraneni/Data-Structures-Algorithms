import java.lang.reflect.Array;
import java.util.*;

/* 
! -------------------------------------- Notes --------------------------------------
* This searching algorithm is an improved version of binary search that is used for "uniformly" distributed data. 
* The algorithm "guesses" wherea  value might be based on a calulated probe.
* If the probe is incorrect, the search space is narrowed and a new probe is calculated


? Interpolation Search: 
* Time Complexity Average Case: O(log(log(n)) --> n is number of elements in data set 
* Time Complexity Worst Case: O(n)

! DISADVANTAGE OF Interpolation Search: 
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


        int[] array = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
        int target = 256;



        long startTime = System.nanoTime();

        int index = interpolationSearch(target, array);

        long deltaTime = System.nanoTime() - startTime; 


        System.out.println("Interpolation Search target was found at index: " + index + " in time span of " + deltaTime + " ns");

        startTime = System.nanoTime();

        int linearIndex = linearSearch(target, array); 

        deltaTime = System.nanoTime() - startTime; 

        System.out.println("Linear search target was found at index: " + linearIndex + " in time span of " + deltaTime + " ns");
    }


    private static int interpolationSearch(int target, int[] array){ 
        int left = 0; int right = array.length -1; 

        int tries = 1; 

        while (left <= right && target >= array[left] && target <= array[right])
        { 
            int guess = left + (right - left) * (target - array[left])/ (array[right] - array[left]);
            System.out.println("Guess: " + guess);

            if (array[guess] == target){
                System.out.println("Tries for Interpolation Search: " + tries);
                return guess; 
            }
            else if (array[guess] < target){
                left = guess + 1; 
                tries++;
            }
            else{
                right = guess - 1;
                tries++;
            }
        }

        return -1; // can't find target
    }


    private static int linearSearch(int target, int[] array){
    
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

    private static int[] generateUniformSortedArray(int size) {
        int[] array = new int[size];
        int startValue = 1; // Starting value for the sorted array

        for (int i = 0; i < size; i++) {
            array[i] = startValue;
            startValue++;
        }

        return array;
    }


}

