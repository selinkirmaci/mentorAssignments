package mentorAssignments.secondAssingment;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArraylistDemo {

	public static void main(String[] args) {
		
		//Variables
	    Scanner scanner = new Scanner(System.in);
	    int size = 0;
	    ArrayList<Integer> myArrayList = new ArrayList<Integer>();
	    boolean sizeAccepted = false;
	    String warningMessage = "";
	    int max = Integer.MIN_VALUE; 
	    
	    
	    warningMessage = "Welcome!";
	    
	    do {
	        System.out.println("Please enter a positive the size of the arraylist you want to create");
	        while (!scanner.hasNextInt()) {
	            System.out.println("Please enter an integer");
	            scanner.next(); // this is important!
	        }
	        size = scanner.nextInt();
	        sizeAccepted = true;
	    } while (!sizeAccepted || size <= 0);
	   
	    
	    do {
	        System.out.println("Please enter your numbers one by one");
	        while (!scanner.hasNextInt()) {
	            System.out.println("Please enter an integer");
	            scanner.next(); // this is important!
	        }
	        int newNumber = scanner.nextInt();
	        myArrayList.add(newNumber);
	        if(max < newNumber) {
	        	max = newNumber;
	        }
	    } while (myArrayList.size() < size);
 

				
		System.out.println("Max number is: "+ max);
		
		
	}

}
