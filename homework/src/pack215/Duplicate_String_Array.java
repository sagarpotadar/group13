package pack215;

public class Duplicate_String_Array
{
	public static void main(String args[])
	{
		char a[] = { 's','a','g','a','r','s'};
		
		for (int  i = 0 ; i < a.length ; i++)
		{
			for (int j = i+1 ; j<a.length ; j++)
			{
				if (a[i] == a[j])
					System.out.println(a[j]);
			}
		}
		
	}


}
