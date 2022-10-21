package automation;

import java.util.Scanner;

public class ScannerClassString {
	public static void main(String[] args) {
		
	System.out.println("Please enter string");
	Scanner sc = new Scanner(System.in);
	String enteredName = sc.nextLine();
	//int n=sc.nextInt();
	double d=sc.nextDouble();
	//System.out.println(name);
	
	String nameArray[] = enteredName.split(" ");
	 for (int j = 0; j < nameArray.length; j++) {
		 int count=0;
		for (int i = nameArray[j].length() - 1; i >= 0; i--) {
			System.out.print(nameArray[j].toUpperCase().charAt(i));
			//count++;				
		}
		System.out.print("  ");			
		//System.out.println(name1[j].toLowerCase());			
	}
	 //if(sc.)
	}

}
