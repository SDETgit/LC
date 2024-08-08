package Easy;

import java.util.Stack;

public class E20_duplicate_brakets {
	//((a+b)+((c+d)))
	//The subexpression "c+d" is surrounded by two
	//pairs of brackets.
	//
	//(((a+(b)))+(c+d))
	//The subexpression "a+(b)" is surrounded by two 
	//pairs of brackets.
	//
	//(((a+(b))+c+d))
	//The whole expression is surrounded by two 
	//pairs of brackets.
	//
	//((a+(b))+(c+d))
	//(b) and ((a+(b)) is surrounded by two
	//pairs of brackets but, it will not be counted as duplicate.

	public static boolean hasDuplicates(String s) {
       
		Stack<Character> st = new Stack<>();
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch== ')')
			{
				if(st.peek() =='(')
				{
					
					return true;
				}
				else {
					while(st.peek()!='(') {
						st.pop();
					}
					st.pop();
				}
			}
			else {
				st.push(ch);
			}
		}
		
		return false;
            }
	
	
            
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "((a+(b))+(c+d))";
		System.out.println(hasDuplicates(s));
		
		

		 }
}