package automation;

public class AdditionOfNumbers {
	
	public static void main(String[] args) {
		String s="jef365363bhvhg5434";
		int add=0;
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				//System.out.println(s.charAt(i));
			add=add+Character.getNumericValue(s.charAt(i));
			}
		}
		System.out.println(add);
	}

}
