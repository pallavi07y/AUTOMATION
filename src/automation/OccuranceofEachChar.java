package automation;

public class OccuranceofEachChar {
	
	public static void main(String[] args) {
		
	String s="I am aparna and I am from pune";
	int count;
	
	//char chArray[]=new char[s.length()];
	//s.contains("I");
	
	String mCheckedChars="";
	
	for(int i=0;i<s.length();i++)
	{
		count=0;
		
		if(s.charAt(i)==' ')
		{
			continue;
		}
		if(mCheckedChars.contains(Character.toString(s.charAt(i)))) 
		{
			continue;
		}
		mCheckedChars = mCheckedChars+s.charAt(i);
		
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
