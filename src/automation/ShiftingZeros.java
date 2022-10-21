package automation;

public class ShiftingZeros {

	public static void main(String[] args) {
		 int intarr[]={1,0,1,0,1,3,0,1};
	       int newarr[]=new int[intarr.length];
	       int c=newarr.length-1;
	       for(int i=0;i<intarr.length;i++)
	       {
	           if(intarr[i]!=0)
	           {
	              // System.out.println(intarr[i]);
	               newarr[c]=intarr[i];
	               c--;
	           }
	           
	       }
	       System.out.println("hello");
	       for(int i=0;i<newarr.length;i++)
	       {
	            System.out.println(newarr[i]);
	       }

	}
}
