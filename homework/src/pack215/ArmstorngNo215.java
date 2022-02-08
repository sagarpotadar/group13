package pack215;

public class ArmstorngNo215
{
	public static void main(String[] arg)
	{
		int i = 1 ,a,arm,n ;
		System.out.println("Armstorng Numbers between 1 to 500");
	
		while(i<500)
		{
		n=i;
		arm=0;
		while(n>0)
		{
			a=n%10;
			arm=arm+(a*a*a);
			n=n/10;
		}
		if(arm==i)
			System.out.println(i);
		}

	}
}	
