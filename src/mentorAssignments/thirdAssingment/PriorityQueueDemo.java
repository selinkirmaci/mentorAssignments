package mentorAssignments.thirdAssingment;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating empty priority queue
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
  
        // Adding items to the pQueue using add()
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);
        
        Iterator iterator = pQueue.iterator();
        
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        

        // Printing the top element of PriorityQueue
        System.out.println("pQueue.peek(): "+ pQueue.peek());
  
        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println("pQueue.poll(): "+pQueue.poll());
  
        // Printing the top element again
        System.out.println("pQueue.peek() again: " +pQueue.peek());
        
        PriorityQueue<String> pq = new PriorityQueue<>();
        
        pq.add("selin");
        pq.add("ali");
        pq.add("nihal");
  
        Iterator iteratorString = pq.iterator();
  
        while (iteratorString.hasNext()) {
            System.out.print(iteratorString.next() + " ");
        }

	}

}
