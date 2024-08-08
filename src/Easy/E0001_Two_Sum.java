package Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class E0001_Two_Sum {
 public static void main(String[] args) {
	int nums[]  = {3,2,4};
	int target = 6;
	int re[] = new int[2];
	//ArrayList<Integer> al = new ArrayList<Integer>();
	
	for (int i=0;i<nums.length;i++)
	{
		for(int j=0;j<nums.length;j++)
		{
			if(i!=j&&(nums[i]+nums[j])==target)
			{
				re[0] = i;
				re[1] = j;
				break;
			}
		}
	}
	
	System.out.println(Arrays.toString(re));
}
}
