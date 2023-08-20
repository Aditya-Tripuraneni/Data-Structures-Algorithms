import java.util.*;

/* 
! -------------------------------------- Notes --------------------------------------
* Queues are a FIFO data stucutre. They are a first in first out type which is similar to how lines and queues work in reality
* Queues are a linear data structure
* Queues have a head and a tail. Heads are the first element and tails are the last element
* Queues are implemented via a linked list
* A good note is that queues are used in algorithms like breadth-first-search
! -----------------------------------------------------------------------------------

*/

/*
 ! Applications: 
 * Traffic managment, network protocols, web servers, task scheduling, batch processing
 */


public class Main {
    public static void main(String[] args) {
        System.out.println("First line to be printed in the queues main java file. ");

        Queue<Dog> queue = new LinkedList<Dog>();  // our queue has been creating with the dog data type 
        // ! We use the linked list to instantiate our queue object

        Dog milo = new Dog("Milo", 5, "Double Doodle");
        Dog oslo = new Dog("Oslo", 3, "Golden Doodle");
        Dog max = new Dog("Max", 7, "Husky");


        //! Adding elements to our queue consisting of dog type
        queue.offer(milo); 
        queue.offer(oslo);
        queue.offer(max);

        System.out.println(queue.peek().getName()); // Output --> Milos
        /*
         * Here we are peeking our queue, it will show us the first element in our queue which is Milo. 
         * We are printing milos name because we are calling the getName() method which I created in the Dog.java file. 
         * Note if I didn't call the getName() method, I would be printing out an object in memory
         */

        queue.poll(); //removing milo from our queue
        //our queue now is Oslo --> Max where Oslo will be served next (or polled next if we call that method again)

        System.out.println(queue.peek().getName()); // Output --> Oslo

        System.out.println(queue.contains(oslo));  // Output --> True
        // the contains method just checks to see if an element exists in the queue

    }

}

