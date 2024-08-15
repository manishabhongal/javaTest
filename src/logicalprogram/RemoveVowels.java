package logicalprogram;

public class RemoveVowels {
	public static void main(String[] args) {
		
		String s="Velocity";  //e o i
		
		String s1 = s.toLowerCase();		//vowels-------->a e i o u
		
		String z="";
		int count=0;
		
		for(int i=0;i<=s1.length()-1;i++) {
			
			char t = s1.charAt(i);
			
			if(t=='a'||t=='e'||t=='i'||t=='o'||t=='u') {
				count++;
				continue;
			}
			z=z+t;
			}
		System.out.println("count of vowels is: "+count);
			System.out.println(z);
			
	}

}
