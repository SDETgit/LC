package Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class E0009_Palindrome_Number2 {
	 public static boolean isPalindrome(int x) {
		
		
		if (x<0)
		{
			return false;
		}	
		int original =x;
		int rem=0;
		while(x!=0)
		{
			rem = rem*10+x%10;
			x=x/10;
		}
		System.out.println(rem==original);
		return (rem==x);
	 }
 public static void main(String[] args) {
	
	 isPalindrome(121);
}
}
