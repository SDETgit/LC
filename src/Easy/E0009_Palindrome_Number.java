package Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class E0009_Palindrome_Number {
	public static boolean isPalindrome(int x) {
		while (x<0)
		{
			return false;
		}
		int temp=0;
		int sum = 0 ;
		int x2=x;
		while (x>0)
		{
			temp= x%10;
			sum= sum*10;
			sum = sum+temp; 
			
			x=x/10;
		}
		
		return x2==sum;
	}
 public static void main(String[] args) {
	int x = 12321;
	
	String x1 = String.valueOf(x);

	
	char[] ch = x1.toCharArray();
	char temp;
	
	for(int i=0;i<x1.length()/2;i++)
	{
	  	temp = ch[i];
	  	ch[i] = ch[x1.length()-i-1];
	  	ch[x1.length()-i-1] = temp;
	  	
	}
	
	String x2 = String.copyValueOf(ch);
	
	boolean flag ;
	
	if(x1.equals(x2))
		{flag=true;}
	
	else { flag = false;}
	System.out.println(x1+" "+x2+" "+flag);
	
	System.out.println(isPalindrome(x));
	
}
}
