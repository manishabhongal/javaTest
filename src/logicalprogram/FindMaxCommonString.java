package logicalprogram;

public class FindMaxCommonString {
	public static void main(String[] args) {
		String s1="tendulkar";
		String s2="gavaskar";
		
		        System.out.println("Longest Common Substring: " + findLongestCommonSubstring(s1, s2));
		    }

		    public static String findLongestCommonSubstring(String s1, String s2) {
		        int maxLength = 0;
		        String longestSubstring = "";

		        for (int i = 0; i < s1.length(); i++) {
		            for (int j = i + 1; j <= s1.length(); j++) {
		                String substring = s1.substring(i, j);
		                if (s2.contains(substring) && substring.length() > maxLength) {
		                    maxLength = substring.length();
		                    longestSubstring = substring;
		                }
		            }
		        }

		        return longestSubstring;
		    }
		

		
	

}
