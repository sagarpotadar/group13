package pack215;

import java.util.Hashtable;
import java.util.Map;

public class hashtable 
{
	public static void main(String[] args) 
	{
		Hashtable<Integer,String> htable = new Hashtable<Integer,String>();
		
		htable.put(10, "Velocity");
		htable.put(20, "Class");
		htable.put(50, "2021");
		htable.put(40, "Batch");
		htable.put(55, "Katraj");
		
		for(Map.Entry<Integer,String> i : htable.entrySet() )
		{
			System.out.println("key = " +i.getKey()   +   "value =  " + i.getValue());
		}
		
		System.out.println("***************************************************");
		
       Hashtable<Character,String> table = new Hashtable<Character,String>();
		
       table.put('A', "Velocity");
       table.put('B', "Class");
       table.put('C', "2021");
       table.put('D', "Batch");
       table.put('E', "Katraj");
		
		for(Map.Entry<Integer,String> j : htable.entrySet() )
		{
			System.out.println("key = " +j.getKey()   +   "value =  " + j.getValue());
		}
		

		
	}

}
