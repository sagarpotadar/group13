package pack215;

public class quadrant2nd3rd215
{
	public static void main(String[]args)
	{
		for ( int a=1;a<=5;a++)
		{
			for ( int b=1;b<=a;b++)
			{
				System.out.print("*");
			}
			  System.out.println();
		}
		for ( int a=5;a>=1;a--)
		{
			for ( int b=1; b<a;b++) // b<=a ,= only cancelled
			{
				System.out.print("*");
			}
			  System.out.println();
				
		}
	}
}
