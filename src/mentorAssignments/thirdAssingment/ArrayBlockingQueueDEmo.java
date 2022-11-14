package mentorAssignments.thirdAssingment;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueDEmo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue = new ArrayBlockingQueue<>(4);
		
		int i = 0;
		while(true)
		{
			try {
				queue.add(""+(i++));
				}catch(Exception ex){
					break;
				}
		}
		System.out.println("Queue: "+ queue);

	}

}
