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




 
}
}

