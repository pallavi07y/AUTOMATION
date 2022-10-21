package automation;

public class StringAdd {
	
	public static void main(String[]args)
	{
		String a="50";
		int b= Integer.parseInt(a);
		
		System.out.println(b= b+5);
		
		String s= "Pallavi20Jadhav35";
		int add=0;
		for( int i=0; i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				add=add+Integer.parseInt(s.substring(i, i+1));
			}
			
		}
		System.out.println(add);
	}

}
