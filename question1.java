package pro;
import java .util.*;
class program9 {

	   public static void main(String args[]) {
	      program9 obj = new program9();
			
	    
	      MathOperation addition = (int a, int b) -> a + b;
			
	
	      MathOperation subtraction = (a, b) -> a - b;
			
	     
	      MathOperation multiplication = (int a, int b) -> { return a * b; };
			
	 
	      MathOperation division = (int a, int b) -> a / b;
			
	      System.out.println( obj.operate(10, 5, addition));
	      System.out.println(obj.operate(10, 5, subtraction));
	      System.out.println( obj.operate(10, 5, multiplication));
	      System.out.println(obj.operate(10, 5, division));
			
	   }
		
	   interface MathOperation {
	      int operation(int a, int b);
	   }
		
		
	   private int operate(int a, int b, MathOperation mathOperation) {
		   int c,d;
		   Scanner scan=new Scanner(System.in);
		   c=scan.nextInt();
		   d=scan.nextInt();
	      return mathOperation.operation(c, d);
	   }
	}

