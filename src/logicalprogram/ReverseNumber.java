package logicalprogram;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int num=1234;
		
		int revNum=0;
		
		System.out.println("original number is: "+num);

		for(int i=num;i>0;i=i/10) { //1234
			
			int rem = i%10;  //this will give 4 i.e, reminder we want to get reverse num
			
			revNum=revNum*10+rem;//4  //now to get it at in the unit tens hundreds thousands form we multiply it by 10
			
			}
		System.out.println("Reverse number is: "+revNum);
	}
}
