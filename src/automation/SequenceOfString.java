package automation;

public class SequenceOfString {
	
	public static void main(String[] args) {
		String str="aparna";
		char c[]=str.toCharArray();
		char ch;
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]<c[j])
				{
					ch=c[i];
					c[i]=c[j];
					c[j]=ch;
					
					
				}
			}
		}
		for(int i=0;i<c.length;i++)
		{
		System.out.print(c[i]);
		}
		
	}


}
