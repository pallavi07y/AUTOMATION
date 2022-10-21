package automation;

import java.util.Arrays;

public class StringArray {
	
	public static void main(String[] args) {
		
		String [] a= {"c", "a", "e", "b", "d", "f"};
		
		int size= a.length;
		
		for(int i= 0; i<a.length; i++)
		{
			for(int j= i+1; j<a.length; j++)
			{
				if(a[i].compareTo(a[j])>0)
				{
					String s= a[i];
					a[i]= a[j];
					a[j]= s;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
