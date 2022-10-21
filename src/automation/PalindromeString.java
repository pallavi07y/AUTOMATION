package automation;

public class PalindromeString {
	
	public static void main(String[] args) {
		String s="ababa";
	
		String newstr="";
		for(int i=s.length()-1;i>=0;i--)//2,1,0
		{
		   newstr=newstr+s.charAt(i);
		}
		System.out.println(newstr);
		if(s.equals(newstr))
		{
			System.out.println(s+ " is palindrome string");
		}
		else
		{
			System.out.println("not palindrome string");
		}
	}

}
