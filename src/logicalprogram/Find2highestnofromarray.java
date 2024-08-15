package logicalprogram;

import java.util.Arrays;

public class Find2highestnofromarray {


	    public static void findTwoHighestNumbers(int[] ar) {
	        if (ar.length < 2) {
	            System.out.println("Array should contain at least two elements.");
	            return;
	        }

	        // Sort the array in ascending order
	        Arrays.sort(ar);

	        // The highest number is the last element
	        int highest = ar[ar.length - 1];
	        // The second highest number is the second last element
	        int secondHighest = ar[ar.length - 2];

	        System.out.println("The highest number is: " + highest);
	        System.out.println("The second highest number is: " + secondHighest);
	    }

	    public static void main(String[] args) {
	        int ar[] = {-1, 2, 5, 9, 8, 7, 9, 10, 10};
	        findTwoHighestNumbers(ar);
	    }
	

}
