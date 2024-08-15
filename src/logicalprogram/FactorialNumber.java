package logicalprogram;

public class FactorialNumber {

	public static void main(String[] args) {
		
		// 4!=4*3*2*1=24
		
		int num=4;
		int factorial=1;
		
		for(int i=num;i>=1;i--) {
			
			factorial=i*factorial;
		}
		
		System.out.println("Factorial of "+num+" is "+factorial);
	}
}
