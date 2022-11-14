package mentorAssignments.secondAssingment;

import java.util.ArrayList;

public class MemoryProfiler {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> arr = new ArrayList<Integer>(10);
		
		//ArrayList<ArrayList<Integer>> ar =  new ArrayList<ArrayList<Integer>>(10);
		
		for(int i = 0; i < 15; i++) {
			arr.add(i);
			System.out.println("Saved");
		}
		
		System.out.println("Done: "+ arr.size());
	}

}
