package logicalprogram;


public class FibonacciSeries {
	public static void main(String[] args) {
		int num = 9;
		int num1=0;
		int num2=1;
		int sum=0;
		
		for(int i=1;i<=num;i++) {
			
			
			System.out.println(num2+" ");
			
			sum=num1+num2;
			num1=num2;
			num2=sum;
		}
	}

}
