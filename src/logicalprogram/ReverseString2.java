package logicalprogram;

public class ReverseString2 {
	
	public static void main(String[] args) {
		String temp = "&6G%8HK%&9e6&";  //&6e%9KH%&8G6&   "&6e%9HK%&8G6&"
		String rev=""; 
		
		
		
		char[] s = temp.toCharArray();
		
		for(int i=s.length-1;i>=0;i--) {
			
		System.out.println(s[i]+" ");

	
	}
	}
}

