package automation;

public class ReverseEachWordInString {
	
	public static void main(String[] args) 
	{
		
		String s1="my name is abc";
		
		
		String [] ar=s1.split(" ");  //{my(0) name(1) is(2) abc(3)}
		
		
		for(int i=0; i<=ar.length-1; i++)
		{
			String org = ar[i];
			
			String rev="";
			for(int j=org.length()-1; j>=0; j--) 
			{
				rev=rev+org.charAt(j);
			}
			
			System.out.println(rev);
		}
		
	}

}