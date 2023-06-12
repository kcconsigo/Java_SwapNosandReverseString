
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		String words = "Mississippi";
		
		char[] reverseWords = words.toCharArray();
		
		for(int i = reverseWords.length - 1; i >= 0; i--) {
			
			System.out.print(reverseWords[i]);
			
			
		}
	}

}
