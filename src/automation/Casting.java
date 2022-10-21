package automation;

public class Casting {
	
	public static void main(String[]args)
	{
		//Implicit Casting
		byte a=125;
		int b;
		b=a;
		System.out.println(b);
		
		double c=b;
		System.out.println(c);
		
		float t= b;
		System.out.println(t);
		
		long l= 400;
		c=l;
		System.out.println(c);
		
		//Explicit Casting
		
		int i=3000;
		byte g;
		g=(byte)i;
		System.out.println(g);
		
		double d=120.345;
		int j;
		j=(int)d;
		System.out.println(j);
		
		float f= 140.43f;
		j=(int)f;
		System.out.println(j);
		
		long k;
		k=(long)d;
		System.out.println(k);
		
		
	}

}
