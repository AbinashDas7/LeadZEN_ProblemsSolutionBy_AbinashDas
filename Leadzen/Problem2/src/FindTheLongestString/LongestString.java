package FindTheLongestString;

import java.util.Scanner;

public class LongestString {

	// str[i..j] are distinct, otherwise returns false
		public static Boolean distictChar(String str, int i, int j)
		{
		    boolean[] visited = new boolean[26];
		 
		    for(int k = i; k <= j; k++)
		    {
		        if (visited[str.charAt(k) - 'a'] == true)
		            return false;
		             
		        visited[str.charAt(k) - 'a'] = true;
		    }
		    return true;
		}
		 
		//It will return length of the longest substring with all distinct characters.
		public static int longestUniqueSubsttr(String str)
		{
		    int n = str.length();
		     
		    int res = 0;
		     
		    for(int i = 0; i < n; i++)
		        for(int j = i; j < n; j++)
		            if (distictChar(str, i, j))
		                res = Math.max(res, j - i + 1);
		                 
		    return res;
		}

		public static void main(String[] args)
		{
		    Scanner sc = new Scanner(System.in);
		    String str = sc.next();
		    System.out.println("The input string is: " +"'"+ str +"' ");
		 
		    System.out.println(longestUniqueSubsttr(str));

		}
	}
