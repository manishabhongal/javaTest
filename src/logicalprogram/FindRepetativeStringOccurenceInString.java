package logicalprogram;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class FindRepetativeStringOccurenceInString {
	
	public static void main(String[] args) {
		
		String str= "manisha suvarna mayuri manisha suvarna bhakti bhakti bhakti reeva";
		
		String ar[]=str.split(" ");
		
		HashMap<String, Integer>hm=new HashMap<String, Integer>();
		
		for(int i=0;i<=ar.length-1;i++) {
			String temp = ar[i];
			
			if(hm.containsKey(temp)) {
				
				hm.put(temp, hm.get(temp)+1);
				
			}else {
				
				hm.put(temp, 1);
			}
		}
		
		System.out.println(hm);
		
		Set<Entry<String, Integer>> ents = hm.entrySet();
		
		for(Entry<String, Integer> en:ents) {
			System.out.println(en.getKey()+": "+en.getValue());
		}
		
		System.out.println("==================================");
		
		for(Entry<String, Integer> en:ents) {
			
			if(en.getValue()<3) {
				System.out.println(en.getKey()+": "+en.getValue());
			}
		}
	}

}
