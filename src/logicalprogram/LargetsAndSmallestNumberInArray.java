package logicalprogram;

import java.util.ArrayList;
import java.util.TreeSet;

public class LargetsAndSmallestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 int[]ar={10,20,30,40,50,60,70,1,2,3};
	        
	        //create the object of treeset 
	        
	        TreeSet<Integer> ts=new TreeSet<Integer>();
	        
	        for(int i=0;i<ar.length;i++){
	            
	            ts.add(ar[i]);
	        }
	        
	        System.out.println(ts);
	    
	    
	    //convert treeset into arraylist
	    
	    ArrayList<Integer>al=new ArrayList<Integer>(ts);
	    
	    //smallest number
	    
	  System.out.println(al.get(0));
	  
	  //2nd smallest number
	  System.out.println(al.get(1));
	  
	  //largest number
	  System.out.println(al.get(al.size()-1));
	  
	  //2nd largest number
	  
	  System.out.println(al.get(al.size()-2));
	  
	  System.out.println(ar[0]);
	}
	


	}


