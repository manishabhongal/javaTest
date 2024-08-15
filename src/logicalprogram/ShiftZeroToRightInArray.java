package logicalprogram;

public class ShiftZeroToRightInArray {
	public static void main(String[] args) {
		
		int ar[]= {10,20,30,40,50,60,0,70,80,0,90,0,100};
		int index=0;
		//we will create one more array for comparing having same length as first array
		
		int ar1[]=new int[ar.length];
		
		for(int i=0;i<=ar.length-1;i++) {
			
			if(ar[i]!=0) {
				
				ar1[index]=ar[i];
				
				index++;
			}
		}
		
		//print second array now
		
		for(int i=0;i<=ar1.length-1;i++) {
			
			System.out.print(ar1[i]+" ");
		}
	}

}
