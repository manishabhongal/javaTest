package logicalprogram;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {

		// java avaj-->String containing same letters in it

		String str1 = "java";
		String str2 = "avaj";

		char[] ar1 = str1.toCharArray();

		char[] ar2 = str2.toCharArray();
		
		Arrays.sort(ar1);
		Arrays.sort(ar2);
		
		
		boolean result = Arrays.equals(ar1, ar2);
		
		if(result) {
			
			System.out.println("String is Anagram String");
		}else {
		
		System.out.println("String is not Anagram String");
		}
	}
}
