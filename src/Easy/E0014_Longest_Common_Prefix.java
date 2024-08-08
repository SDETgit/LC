package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class E0014_Longest_Common_Prefix {
	
 public static void main(String[] args1) {
	String [] args= {"flower","flow","flight"};
	Arrays.sort(args);
	System.out.println(Arrays.toString(args));
	String x1 = args[0];
	String x2 = args[args.length-1];
	
	int val = 0;
	
	for(int i=0;i<x1.length();i++)
	{
	if(x1.charAt(i)==x2.charAt(i))
		{
			val++;
		}
	else {
		break;
	}
	}
	System.out.println(val);
	
	if (val ==0)
	{
		System.out.println("");
	}
	else 
	{
		System.out.println(x1.substring(0,val));
	}
}
}
