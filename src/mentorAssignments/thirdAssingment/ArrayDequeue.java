package mentorAssignments.thirdAssingment;

import java.util.ArrayDeque;

public class ArrayDequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayDeque<String> animals = new ArrayDeque<>();
		
		// Using add()
        animals.add("Dog");
        animals.add("Giraffe");
        
        System.out.println("ArrayDeque after normal add: " + animals);



        // Using addFirst()
        animals.addFirst("Cat");
        
        System.out.println("ArrayDeque after addFirst: " + animals);


        // Using addLast()
        animals.addLast("Horse");
        
        System.out.println("ArrayDeque after addLast: " + animals);

        
        animals.add("Elephant");
        
        
        System.out.println("ArrayDeque after normal add: " + animals);

		
	}

}
