import java.util.Scanner;

public class ReverseInputString {

	public static void main(String[] args) {
		
		
		 Scanner sc = new Scanner(System.in);
		  
		  System.out.println("Enter words:");
		  
		  String words = sc.next();
		  
		  char[] reverseWords = words.toCharArray();
		  
		  for(int i = reverseWords.length - 1; i >= 0; i--) {
		  
		  System.out.print(reverseWords[i]);
		  
		  
		  }
		
		
//		char letter;
		
		//System.out.println("Enter letters:");
		
//		for(int letter = a; letter <= z; letter ++) {
//			System.out.println(letter);
//		}
//		System.out.println("Enter letters:");
//		for(letter = 'A'; letter <= 'Z'; letter ++) {
//			System.out.print(letter+" ");
//		}
		
	}

}
