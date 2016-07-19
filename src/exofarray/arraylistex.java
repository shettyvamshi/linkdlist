package exofarray;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylistex
{
	
	public static void main(String[] aa )
	
	{
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("java");
		al.add("C++");
		al.add("PERL");
		al.add("PHP");
		al.add("BASIC");
		System.out.println(al);
		System.out.println("Does this list contains Java "+al.contains("Java"));
		al.add(2,"COBAL");
		System.out.println(al);
		System.out.println(al.isEmpty());
		System.out.println(al.size());
		Iterator<String>itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
		
		
		
		
		

	


