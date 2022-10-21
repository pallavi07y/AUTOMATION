package automation;

public class LCMHCF {
	
	 public static void main(String[] args) {
			int no1 = 12, 
				no2 = 8;
			int lCM, GCD;
			if (no1 > no2) 
			{
				lCM = no1;
			} else
			{
				lCM = no2;
			}
			while (true)
			{
				if (lCM % no1 == 0 && lCM % no2 == 0) 
				{
					break;
				}
				++lCM;
			}
			System.out.println("LCM is="+lCM);
			
			if (no1 < no2)
			{
				GCD = no1;
			} 
			else 
			{
				GCD = no2;
			}
	       while (true)
	       {
				if (no1 % GCD == 0 && no2 % GCD == 0) 
				{
					break;
				}
				--GCD;
			}
			System.out.println("GCD is="+GCD);
		}


}
