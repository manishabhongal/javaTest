package collection;

import java.util.HashMap;

public class DemoHashMap {
	public static void main(String[] args) {
		
	
	HashMap<Integer,String> h= new HashMap<Integer,String>();

	//put method is used to add data

	h.put(111, "omkar");
	h.put(112, "vikas");
	h.put(113, "rahul");
	h.put(113, "shubham");
	h.put(113, "pramod");
	h.put(114, "omkar");
	h.put(null,null);
	h.put(116,null);
	h.put(115,null);


	System.out.println(h);


}
}