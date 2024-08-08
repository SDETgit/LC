package Easy;

import java.util.Stack;

public class E020_Valid_Parentheses {
//	Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//	An input string is valid if:
//
//	Open brackets must be closed by the same type of brackets.
//	Open brackets must be closed in the correct order.
//	Every close bracket has a corresponding open bracket of the same type.
	public static boolean isValid(String s) {
        while (true) {
            if (s.contains("()")) {
                s = s.replace("()", "");
            } else if (s.contains("{}")) {
                s = s.replace("{}", "");
            } else if (s.contains("[]")) {
                s = s.replace("[]", "");
            } else {
                // If the string becomes empty, it indicates all brackets are matched.
            	
                return s.isEmpty();
            }}}
	
	public static boolean isValid2(String s) {
		Stack<Character> st = new Stack<Character>();
		for (char c : s.toCharArray()) {
			if (c=='('||c=='{'||c=='[') {
				st.push(c);				
			}
			else if (c==')')
			{
				if(st.size()==0)
				{
					return false;
				}
				else if(st.peek()!=')')
				{
					return false ;
				}
				else {
					st.pop();	
				}
			}
			else if (c=='}')
			{
				if(st.size()==0)
				{
					return false;
				}
				else if(st.peek()!='}')
				{
					return false ;
				}
				else {
					st.pop();	
				}
			}
			else if (c==']')
			{
				if(st.size()==0)
				{
					return false;
				}
				else if(st.peek()!=']')
				{
					return false ;
				}
				else {
					st.pop();	
				}
			}
		}
		return true;
	}
            
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "(){{}}[]";
		System.out.println(isValid(s));
		
	

		 }
}