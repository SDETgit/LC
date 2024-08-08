package Easy;

import java.util.Stack;

public class E013_Roman_integer {
	//Symbol       Value
	//I             1
	//V             5
	//X             10
	//L             50
	//C             100
	//D             500
	//M             1000

	 public static int romanToInt(String s) {
		int nums[] = new int[s.length()];
		 for(int i=0;i<s.length();i++)
		 {
			switch(s.charAt(i))
			{
			case 'I' : nums[i] = 1; break;
			case 'V' : nums[i] = 5; break;
			case 'X' : nums[i] = 10; break;
			case 'L' : nums[i] = 50; break;
			case 'C' : nums[i] = 100; break;
			case 'D' : nums[i] = 500; break;
			case 'M' : nums[i] = 1000; break;
			}
		 }
		 int sum =0 ;
		 for(int i=0;i<nums.length-1 ;i++)
		 {
			 if (nums[i]<nums[i+1])
			 {
				 sum = sum-nums[i];
			 }
			 else 
			 {
				 sum = sum+nums[i];
			 }
		 }
		 return sum + nums[nums.length-1];
		 
	 }
	
	
            
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "XCVIII";
		System.out.println(romanToInt(s));
		
		

		 }
}