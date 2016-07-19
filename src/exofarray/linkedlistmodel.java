package exofarray;

import java.util.Collections;

public class linkedlistmodel

{
	public static void main(String[] args)
	
LinkedList<Empl>list=new LinkedList<Empl>();
	
	list.add(new Empl("Tim",2000));
	list.add(new Empl("Rim",3000));
	list.add(new Empl("Jim",4000));
	list.add(new Empl("Kim",5000));
	
	Collections.sort(list,new MySalaryComp());
	
	System.out.println("sorted List");
	for(Empl e:list)
	{
		System.out.println("e");
	}
	class mysalarycomp implements comporator<Empl>
	{
		public int compare(empl el,)
}

}

class MySalaryCom implements Comparator<Empl>
{
	public int compare(Empl e1,Empl e2)
	{
		if(e1.getsalary() < e2.getsalary())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}