import java.util.*;

/* 
! -------------------------------------- Notes --------------------------------------
* Priority Queues are a bit different than FIFO, they deal with elements based on PRIORITY.  
* Elements with highest priority are served before elements with lowest priority. 
* Priority Queues can access highest and lowest elements in constant time O(1)
* They are able to re organize them selves anytime I add an elemenet to it based on the priority. 

! -----------------------------------------------------------------------------------

*/

/*
 ! Applications: 
 * Task scheduling, shortest path algorithms, Dijkstra’s algorithm, A* algorithm 
 */


public class Main {
    public static void main(String[] args) {
        System.out.println("First line to be printed in the priority queues main java file. ");

        Queue<Double> priorityQueue  = new PriorityQueue<>();

        // similarly like a normal queue, we can use the .offer() method to add elements to our priority queue

        priorityQueue.offer(3.0); 

        priorityQueue.offer(4.0);

        priorityQueue.offer(3.9);

        priorityQueue.offer(2.0);

        priorityQueue.offer(1.0); 

        // displaying our priority queue
        //! Notice how our priority queue will sort our elements from least to greatest
        //! This is different than a regular queue
        //! We may want to use this data structure when we have some priority, of storing elements, like sorted order greatest --> lowest or vice versa


        while(!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll()); 
        }
        
        System.out.println("---------------------------------------------\n\n");

        Queue<Double> priorityQueueReverse  = new PriorityQueue<>(Collections.reverseOrder(null)); 
        // This new priority queue will display elements from greatest --> least 

        priorityQueueReverse.offer(10.0);
        priorityQueueReverse.offer(1.34);
        priorityQueueReverse.offer(5.284);
        priorityQueueReverse.offer(1.40);
        priorityQueueReverse.offer(12.04);
        priorityQueueReverse.offer(54.294);

        while (!priorityQueueReverse.isEmpty()){
            System.out.println(priorityQueueReverse.poll());
        }


    }

}

