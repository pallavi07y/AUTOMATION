package automation;

public class ReverseStringSamePosition {
	
	public static void main(String[] args) {
		String s="aparna pallavi";
		String newstr[]=s.split(" ");

		for(int i=0;i<newstr.length;i++)//aparna
		{
			String reverse="";
			for(int j=newstr[i].length()-1;j>=0;j--)
			{
				reverse=reverse+newstr[i].charAt(j);
				
			}
			System.out.print(" "+reverse+" ");
		}
	}

}
