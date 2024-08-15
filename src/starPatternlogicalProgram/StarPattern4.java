package starPatternlogicalProgram;

public class StarPattern4 {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		
		//    *
		//   ***
		//  *****
		// *******
		//*********
		// *******
		//  *****
		//   ***
		//    *
		
		
		
		//rows=9  star1=1  space1=4  star2=0 space2=4
		
		int rows=9;
		int star1=2;
		int space1=5;
		int star2=1;
		
		for(int i=1;i<=rows;i++) {
			
			for(int j=1;j<=star1;j++) {
				
				System.out.print("*");
				
				}
			
			for(int k=1;k<=space1;k++) {
				
				System.out.print(" ");
			}
			
			for(int l=1;l<=star1;l++) {
				
				System.out.print("*");
			}
			
			for(int m=1;m<=star2;m++) {
				
				System.out.print("*");

			}
			
			System.out.println();
			if(i<4) {
				star1++;
				space1--;
				star2++;
			}else {
				
				star1--;
				space1++;
				star2--;
			}
			
	
		}
	}

}
