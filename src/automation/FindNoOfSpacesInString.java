package automation;

public class FindNoOfSpacesInString {

		public static void main(String[] args) {

		
			String str = "a b   c d";
			int count = 0;  
			int size= str.length();
			System.out.println(size);

			//       
			for (int i = 0; i <= str.length() - 1; i++)
			{    //                    0
				char str1 = str.charAt(i);   // ' '
				if (str1 == ' ')    // 
				{
					count++;     //1
				}
			}

			System.out.println("no of spaces in given string: " + count);

			
			//System.out.println(str.replace(" ", ""));
			
		}
	}


