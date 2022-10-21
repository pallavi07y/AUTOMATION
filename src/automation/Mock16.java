package automation;

public class Mock16 {
	
	public static void main(String[] args) {
		
		String str[]= {"a","b","a","c","a","b","d","c","e"}; //a,b,c repeating
		
	for(int i=0; i<str.length; i++) 
	{
		for(int j=0; j<str.length;j++)
		{
			if(str[i]==str[j]&& i!=j)
			{
				if (i<j)
				System.out.println(str[i]);	
				break;
			}
		}
	}

	}
}

