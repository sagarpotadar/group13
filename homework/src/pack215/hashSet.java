package pack215;

import java.util.HashSet;
import java.util.Iterator;

public class hashSet 
{
	public static void main(String[] args) 
	{
		HashSet<String> set = new HashSet<String>();
		
		set.add("Velocity");
		set.add("Katraj");
		set.add("Oct");
		set.add("2021");
		
		int s = set.size();
		System.out.println(s);
		
		Iterator<String> i = set.iterator();
		
		for(String a : set)
		{
			String addr = i.next();
		}
		while(i.hasNext())
		{
			System.out.println(i.next());
		}	
		System.out.println("end");
	}
}
