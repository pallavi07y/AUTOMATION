package automation;

public class Occurance_of_each_word_in_string {
	
	public static void main(String[] args) {
		String s="I am aparna and I am from pune";
		int count;
		for(int i=0;i<s.length();i++)
		{
			count=0;
			for(int j=i;j<s.length();j++)
			{
				
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}
			System.out.println("Occurance of "+s.charAt(i)+" "+ count);
		}

	}

}
