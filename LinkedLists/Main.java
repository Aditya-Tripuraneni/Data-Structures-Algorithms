import java.util.*;

/* 
! -------------------------------------- Notes --------------------------------------
* LinkedLists do not have indicies like Arrays and ArrayLists.
* LinkedLists are beneficial if we care about the time it takes to insert and delete elements.
* LinkedLists take constant O(1) time for insertion and deletion of elements. 
* A down side is searching in a LinkedList takes O(n) time due to not having any indicies. 
* LinkedLists nodes are stored in non consecutive memory locations
* LinkedLists are also DYNAMIC data structures
! -----------------------------------------------------------------------------------

*/

/*
 ! Applications: 
 * Stacks/Queues implemenation, GPS navigation. music playlists, memory management, mailing list
 */


public class Main {
    public static void main(String[] args) {
        System.out.println("First line to be printed in the Linked Lists main java file. ");

        Dog milo = new Dog("Milo", 5, "Double-Doodle");
        Dog oslo = new Dog("Oslo", 3, "Golden-Doodle");
        Dog max = new Dog("Max", 7, "Siberian Husy");

        LinkedList<Dog> linkedList = new LinkedList<Dog>();

        // Linked lists can be implemented like a stack where we use the .push() method

        linkedList.push(milo);
        linkedList.push(oslo);
        linkedList.push(max); 

        // these dog objects will be added like a stack so the order would be
        System.out.println(linkedList); // Output --> [max memory in address, oslo memory in address, milo memory in address]

        for (int i =0; i < linkedList.size(); i ++){
            System.out.println(linkedList.get(i).getName());
        }

        // Linked lists can also be implemented like a queue using the .offer() methodw
        LinkedList<Dog> linkedListQueue = new LinkedList<Dog>();

        linkedListQueue.offer(milo);
        linkedListQueue.offer(oslo);
        linkedListQueue.offer(max);

        System.out.println("\n\n\n");
        
        for (int i = 0; i < linkedListQueue.size(); i ++){
            System.out.println(linkedListQueue.get(i).getName());
        }

        //O (1) insertion time shown bellow
        Dog bailey = new Dog("Bailey", 2, "German Shepherd");
        linkedListQueue.add(2, bailey); //indicies in linkedlists go 0, 1, 2 , ..., n-1, n

        // our .add() method takes O(1) to insert in that position and to delete it would also take O(1) time

        System.out.println("\n\n\n");


         for (int i = 0; i < linkedListQueue.size(); i ++){
            System.out.println(linkedListQueue.get(i).getName());
        }

        linkedListQueue.remove(bailey);
}
}

