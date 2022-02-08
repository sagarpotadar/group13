package pack215;

import java.util.HashMap;
import java.util.Map;

public class hashMap 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> hmap = new HashMap<Integer,String>();
		
		hmap.put(12, "Velocity");   
		hmap.put(15, "Class");
		hmap.put(45, "2021");
		hmap.put(53, "Batch");
		hmap.put(48, "Katraj");
		
		for(Map.Entry<Integer,String> j : hmap.entrySet())
		{
			System.out.println("key = " +j.getKey() +  "value =  " + j.getValue());

		}
		
		System.out.println("=============================");
				
        HashMap<Integer,String> map = new HashMap<Integer,String>();
		
         map.put(12, null);   
         map.put(null, "Class");
         map.put(45, "2021");
         map.put(53, "Batch");
         map.put(48, null);
		
		for(Map.Entry<Integer,String> j : map.entrySet())
		{
			System.out.println("key = " +j.getKey() +  "value =  " + j.getValue());
		}
		
		System.out.println("*******************************");
		
		
		map.put(48, "Pune");
		
		for(Map.Entry<Integer,String> j : map.entrySet())
		{
			System.out.println("key = " +j.getKey() +  "value =  " + j.getValue());

		}
		
		
	}

}
