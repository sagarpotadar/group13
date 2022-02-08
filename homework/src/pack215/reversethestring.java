package pack215;

public class reversethestring
{
	public static void main(String[]args)
	{
		String a = "Sagar";
		String reversedString = "";
		{
			for( int i = a.length()-1;i>=0;i--)
			{
				reversedString  = reversedString + a.charAt(i);
			}
			
			System.out.println(a);
			System.out.println("The Reversed String of a is = "+ reversedString);
//			System.out.println(reversedString);
		}
		
				
	}

}
