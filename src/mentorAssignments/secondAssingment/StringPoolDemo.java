package mentorAssignments.secondAssingment;

public class StringPoolDemo {

	public static void main(String[] args) {

		
		//declare stirng literals
		String str1 = "Hello";
		String str2 = "World";
		String str3 = "Hello";
		
		//check equality
		System.out.println("str1 == str2: "+ (str1 == str2));
		System.out.println("str1 == str3: "+ (str1 == str3));
		
		//declare Strings with new Keyword
		String str4 = new String("Selin");
		String str5 = new String("Kırmacı");
		String str6 = new String("Hello");
		String str7 = new String("Selin");
		
		//check equality
		System.out.println("str4 == str5: "+ (str4 == str5));
		System.out.println("str4 == str7: "+ (str4 == str7));
		
		System.out.println("str1 == str6: "+ (str1 == str6));
		System.out.println("str1 == str6.intern(): "+ (str1 == str6.intern()));
		String temo = str6.intern();

		System.out.println("str1 == str6.intern(): "+ (str1 == temo));
		


		
	}

}
