package collection;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class DemoLinkedHashMap {
	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String>lhm=new LinkedHashMap<Integer, String>();
		
		lhm.put(5, "Manisha");
		lhm.put(9, "Suvarna");
		lhm.put(10, "Yash");
		lhm.put(50, "Tanush");
		
		System.out.println(lhm);
		
		lhm.put(40, "Deepti");
		System.out.println(lhm);
		
		
		Set<Entry<Integer, String>> myEn = lhm.entrySet();
		
		for(Entry<Integer, String> en:myEn) {
			System.out.println(en.getKey()+" "+en.getValue());
		}
		
		
	}

}
