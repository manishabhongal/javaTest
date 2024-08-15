package logicalprogram;

public class SecondLargestNumberInArray {
	    public static void main(String[] args) {
	        int[] arr = {-1, 2, 5, 9, 8, 7, 9, 10, 10};
	        System.out.println("Second Largest Number: " + findSecondLargest(arr));
	    }

	    public static int findSecondLargest(int[] arr) {
	        int firstLargest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;

	        for (int num : arr) {
	            if (num > firstLargest) {
	                secondLargest = firstLargest;
	                firstLargest = num;
	            } else if (num > secondLargest && num != firstLargest) {
	                secondLargest = num;
	            }
	        }

	        return secondLargest;
	    }
	}


