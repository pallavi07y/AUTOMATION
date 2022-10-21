package automation;

public class StringEx {

	public static void main(String[]args)
	{
		String a="velocity";
		String b= "velocity";
		String c= new String ("Testing");
		String d=  new String ("SYSTEM");
		
		System.out.println(a);
		
		System.out.println(a.replaceAll(a, c));
		System.out.println(b.toString());
		System.out.println(b.toUpperCase());
		System.out.println(d.toLowerCase());
		
		
		boolean result= a.equals(b);
		System.out.println(result);
		System.out.println(a.equals(c));
		
		
		b="class";
		
		System.out.println(a.equals(b));
		
		result= a.equalsIgnoreCase(c);
		System.out.println(result);
		
		int size= a.length();
		System.out.println(size);
		
		char x= a.charAt(4);
		System.out.println(x);
		
		System.out.println( b.charAt(4));
		System.out.println(b.length());
		
		String e= a.concat(" batch");
		System.out.println(e);
		
		a=a.concat(" batch");
		System.out.println(a);
		
		System.out.println( a + " data");
		
	}
	
	
	
	
}
