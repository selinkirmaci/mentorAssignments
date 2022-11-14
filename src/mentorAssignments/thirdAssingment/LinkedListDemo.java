package mentorAssignments.thirdAssingment;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> queue = new LinkedList<>();
		
		queue.add("Giraffe");
		queue.add("Dog");
		queue.add("Elephant");
		queue.add("Rabbit");
		
		System.out.println("Queue: " + queue);
		System.out.println("Queue Size: "+ queue.size());
		
		queue.remove("Dog");
		System.out.println("Queue after remove of the dog: "+ queue);

		System.out.println("Queue contains elephant?: "+ queue.contains("Elephant"));

		System.out.println("Queue contains dog?: "+ queue.contains("Dog"));

		
	}

}
