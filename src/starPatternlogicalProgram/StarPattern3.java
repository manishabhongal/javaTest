package starPatternlogicalProgram;

public class StarPattern3 {
	
	public static void main(String[] args) {
		
		//*****
		//*****
		//*****
		//*****
		
		//rows-->4,column-->5,star start count-->5
		
		
		int rows=4;
		int columns=5;
		int star=5;
		
		//outer for loop
		for(int i=1;i<=rows;i++) {
			
		for(int j=1;j<=columns;j++) {
			
			System.out.print("*");
		}
		System.out.println();
		
		}
	}

}
