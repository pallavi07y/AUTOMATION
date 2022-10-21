package automation;

public class StringReverse {

	public static void main(String[]args)
	{
		String a="A u t o m a t i o n";		
		
		int size=a.length();
		
		System.out.println(size);
		
		String x="";
		
		//for (int i=0;i<a.length();i++)
		
		for(int i=( a.length()-1);i>=0;i--)
		{
			x=x+a.charAt(i);
		}
		
		a=x;
		System.out.println(a);
	}
				
}
