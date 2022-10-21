package automation;

public class ArrayDuplicateNo {
	
	public static void main(String[] args) {
		
		int intArray[]= {25,30,25,33,34,25,30,30};
		System.out.println("duplicate no in array are");
		for( int i=0; i<intArray.length;i++)
		{
			for(int j= 0; j< intArray.length;j++)
			{
			if(intArray[i]==(intArray[j]) && i!=j)
			{
				if(i<j)
				System.out.println(intArray[i]);
				break;
			}
					
			}
		}
		
	}

}
