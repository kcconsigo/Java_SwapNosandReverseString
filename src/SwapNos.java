
public class SwapNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 30;
		int y = 20;
		
		int a = 10;
		int b = 5;
		
        a = a * y; // x now becomes 50
        b = a / y; // y becomes 10
        a = a / y; // x becomes 5
        
		System.out.println("After swapping:"
                + " x = " + x + ", y = " + y);
		
				
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
