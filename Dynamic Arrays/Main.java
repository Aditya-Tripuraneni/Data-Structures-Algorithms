import java.util.*;

/* 
! -------------------------------------- Notes --------------------------------------
* Dynamic arrays are diffeernt from static arrays. In the sense they do not have a set size
* C++ dynamic arrays are reffered to as vectors, JS its an array, Java its an ArrayList and Python its a list. 
* Static arrays have a set size when they are defined. 

? STATIC ARRAY: 
* In static arrays accessing an element is done in O(1) time. Searching for an elemenet takes O(n) time,
* and inserting and deleting elements takes O(n) time. 

! DISADVANTAGE OF STATIC ARRAY: 
* The size is static/fixed you cannot change the size of the array once it is defined. 

? DYNAMIC ARRAY: 
* Accessing random elements is done in O(1) time. 
* Easy to insert/delete elements at start and end

! DISADVANTAGE OF DYNAMIC ARRAY: 
* Wastes more memory 
* Shifting elements is done in O(n) time
* Expanding or reducing array size is done in O(n) time

! -----------------------------------------------------------------------------------

*/

/*
 ! Applications: 
 */


public class Main {
    public static void main(String[] args) {
        System.out.println("First line to be printed in the Dynamic Arrays main java file. ");

        ArrayList<String> myArrayList = new ArrayList<String>(); 
        
        //adding elements to the array list
        myArrayList.add("Aditya");
        myArrayList.add("Bob");
        myArrayList.add("Steven");

        DynamicArray dynamicArray = new DynamicArray(5); 

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");
        dynamicArray.add("G");


        System.out.println(dynamicArray);
        System.out.println(dynamicArray.isEmpty());
        System.out.println(dynamicArray.getSize()); //number of elements currently stored
        System.out.println(dynamicArray.getCapacity()); // amount of space dynamic array actually has

        dynamicArray.delete("B");
        dynamicArray.delete("C");
        dynamicArray.delete("D");



        System.out.println(dynamicArray);
        System.out.println(dynamicArray.getSize());
        System.out.println(dynamicArray.getCapacity());

        // LinkedLists vs Array List testings

        ArrayList<Integer> myArrayList = new ArrayList<Integer>(); 
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        long startTime;
        long endTime;
        long elapsedTime;

        for (int i = 0; i < 1_000_000; i ++){
            linkedList.add(i);
            myArrayList.add(i);

        }

        startTime = System.nanoTime();


        //linkedlist operation bellow
        linkedList.remove(linkedList.size() -1);


        endTime = System.nanoTime();

        elapsedTime = endTime - startTime; 

        System.out.println("LinkedList: \t" + elapsedTime + " ns");

        startTime = System.nanoTime();

        // array list operation bellow
        myArrayList.remove(myArrayList.size() -1);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime; 

        System.out.println("ArrayList: \t" + elapsedTime + " ns");




        // ! to get the 0th element of linked list took approx: 26300 ns
        // ! To get the 0th element of array list took approx:  13500ns 

        //! To get the middle element of a linkedlist took approx: 7487700 ns 
        //! To get the middle element of an array list took approx: 17200 ns 

        //? We can see that the array list is a lot faster with grabbing elements

        //*Conclusion:  Accessing an element from an array list is faster than accessing an element from a linked list

        /*
         * The following tests bellow are conducted with removal and insertion with the linked list and the array list
         */

        // ! to remove the 0th element of linked list took approx: 27700 ns
        // ! To remove the 0th element of array list took approx:  547700 ns 

        //! To remove the middle element of a linkedlist took approx: 5476200 ns 
        //! To remove the middle element of an array list took approx: 309900 ns 


        //! To remove the lsat element of a linkedlist took approx: 36000 ns 
        //! To remove the last element of an array list took approx: 17400 ns 

        /*
         * So array lists are more flexible than linked lists.
         * If the data set is extremly large, and we are doing a lot of insertion operations it may be better to use a linkedlist
         * We saw that the arraylist out performed the linkedlist for deleting elements in the middle and at the end
         * The linkedlist was faster with removing the element at the start
         * Traversing a linkedlist takes longer since there are no indicies to refer to
         */









 
}
}

