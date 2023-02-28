package Easy;

import java.util.Arrays;

public class Common_String {

	public static void main(String[] args) {
		String[] s = {"fower","flow","flight"};
		int c=0;
		
		Arrays.sort(s);
		if(s.length==0 || s.equals(null))
		{
			System.out.println("no elements");
		}
		while(c<s[0].length())
		{
			if(s[0].charAt(c)==s[s.length-1].charAt(c)) {
				c++;
			}
			else {
			break;}
		}
		System.out.println(s[0].substring(0, c));
		
	}

}
