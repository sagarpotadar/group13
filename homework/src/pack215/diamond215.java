package pack215;

public class diamond215
{
	public static void main(String[]args)
	{
		int e=5;
		for ( int a=1;a<5;a++)  //a<=5 only = sign cancelled
		{
			for ( int b=e-1;b>=a;b--)
			{
				System.out.print(" ");
			}
			for ( int c=1;c<=a;c++)
			{
				System.out.print("* ");
			}
			   System.out.println();		
	    }
		
		for ( int a=5;a>=1;a--)
		{
			for ( int b=e-1;b>=a;b--)
			{
				System.out.print(" ");
			}
			for ( int c=1;c<=a;c++)
			{
				System.out.print("* ");
			}
			   System.out.println();	
		}

}
}
