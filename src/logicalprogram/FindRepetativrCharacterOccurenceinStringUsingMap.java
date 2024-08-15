package logicalprogram;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class FindRepetativrCharacterOccurenceinStringUsingMap {
	public static void main(String[] args) {
		
		String s="abcdabcdabcdabcabajklmnopgrpqrpqr";
		
		HashMap<Character, Integer>hm=new HashMap<Character, Integer>();
		
		for(int i=0;i<=s.length()-1;i++) {
			
			char temp = s.charAt(i);
		   if(hm.containsKey(temp)) {
			
			hm.put(temp, hm.get(temp)+1);
			
			
		}else {
			
			hm.put(temp, 1);
		}
		
		}
		System.out.println(hm);
				
		Set<Entry<Character, Integer>> ent = hm.entrySet();
		
		for(Entry<Character, Integer> en:ent) {
			
			System.out.println(en.getKey()+": "+en.getValue());
		}
		
		System.out.println("Individual occurence is like below for specific conditions: ");
		for(Entry<Character, Integer> en:ent) {
			
			if(en.getValue()>5) {
				
				System.out.println(en.getKey()+": "+en.getValue());
			}
		
		}

	}

}
