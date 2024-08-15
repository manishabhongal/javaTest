package logicalprogram;

public class PrimeNumber {

	public static void main(String[] args) {
		
		//the number which is divided by 1 and itself
		//----> 1, 3 ,5,7
		
		int num=5;
		int count=0;
	if(num>=1) {	
	for(int i=2;i<num;i++) {
		
		if(num%i==0) {
			count++;
			break;
		}
	}
	
	if(count==0) {
		System.out.println("Number is prime number");
	}else {
		System.out.println("Number is not prime number");
	}
	}
	else {
		System.out.println("Not prime number");
		
		}
	}
		
		
	}

