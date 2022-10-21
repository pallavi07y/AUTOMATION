package automation;

public class PositiveNoAddition {
	
	public static void main(String[] args) {
		int positiveadd=0;
		
		int noArray[]= {2,-6,5,-8,3,-8,-6,-7,6,4};
		for(int i=0;i<noArray.length;i++)
		{
			if(noArray[i]>0)
			{
				positiveadd=positiveadd+noArray[i];
			}
			
		}
		System.out.println("poitive no addtion"+ positiveadd);
	}

}
