package logicalprogram;

public class SwapNumbers {
	
	public static void main(String[] args) {
		
		int a=200;
		int b=300;
		
		//by using third variable
		
		System.out.println("Value of a & b before swap are: "+a+" "+b);
		int c=a;  //200
		a=b;			//300
		b=c; //200
		
		System.out.println("values of a & b after swap are: "+a+" "+b);
		
		
		//without using third variable
		System.out.println("=========================================");
		
      int x=10;
      int y=20;
		System.out.println("Values of x&y before swap are: "+x+" "+y);
   
       x=x+y;  //30
       y=x-y;  //10
       x=x-y;  //20
		System.out.println("Values of x&y after swap are: "+x+" "+y);

		
			} 
	

}
