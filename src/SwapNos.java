
public class SwapNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 30;
		int y = 20;
		
		
		x = x + y;
		y = x - y;
		x = x - y;
		
		
		
		System.out.println("values swap after: x = " + x +" y = " + y);
		
		
		  System.out.println("Calling swap function with inputs 2 & 3"); swap(2,3);
		  System.out.println("Calling swap function with inputs 2 & 3"); swap(-3,5);
		  
		  }
		  
		  private static void swap(int i, int j) { // TODO Auto-generated method stub
		  
		  System.out.println("values swap before: " + i +" + " +j); //swap logic 
		  i = i + j; 
		  j = i - j; 
		  i = i - j;
		  
		  System.out.println("values swap after: " + i +" + " +j);
		 
	}

}
