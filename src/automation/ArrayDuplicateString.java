package automation;

public class ArrayDuplicateString {
	
	public static void main(String[] args) {
		
		String strArray[]= {"pallavi","jadhav","maind","pallavi","prashant","jadhav"};
		System.out.println("duplicate string in array are");
		for( int i=0; i<strArray.length;i++)
		{
			for(int j= 0; j< strArray.length;j++)
			{
			if(strArray[i]==(strArray[j]) && i!=j)
			{
				if(i<j)
				System.out.println(strArray[i]);
				break;
			}
					
			}
		}
		
	}

}
