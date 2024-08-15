package logicalprogram;

import java.util.Scanner;

public class AmrstrongNumber {
	public static void main(String[] args) {
		 //Amrmstrong number means we get same addition when we do the cube of all single numbers and add it we get our original number
		
		//153--------> 1^3+5^3+3^3=1+125+27=153
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		
		int num = sc.nextInt();
		
		int num1=0;
		
		for(int i=num;i>0;i=i/10) {
			
			int rem=i%10;
			
			num1=num1+(rem*rem*rem);
			
			}
		
		if(num1==num) {
			System.out.println("Number is Armstrong number");
		}else {
			System.out.println("Number is not Armstrong number");

		}
	}

}
