package pack215;

import java.util.ArrayList;

public class arraylist 
{
	public static void main(String[] args) {
		ArrayList array = new ArrayList();
		
		array.add(12);
		array.add('$');
		array.add("Velocity");
		array.add(12.98);
		System.out.println(array.get(2));
		
		int s = array.size();
		
		System.out.println(s);
		
	}

}
