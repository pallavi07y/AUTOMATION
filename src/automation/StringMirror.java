package automation;

public class StringMirror {
	
	public static void main(String[] args) {
		
		String a= "Pallavi Jadhav";
		String []b= a.split(" ");
		String revString="";
		
		for(int i=0; i<b.length;i++)
		{
			String c= b[i];
			String revc="";
			for(int j=c.length()-1;j>=0;j--)
			{
				revc=revc+c.charAt(j);
			}
			revString=(revString+revc+" ");
		}
		System.out.print(revString);
	}

}
