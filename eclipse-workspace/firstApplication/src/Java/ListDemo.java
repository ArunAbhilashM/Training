package Java;

import java.util.Date;

import java.util.Iterator;

import java.util.ArrayList;

import java.util.List;
import java.util.Set;

 

public class ListDemo {

 

	public static void main(String[] args) {

		List <Integer>myList=new ArrayList <Integer>();
		List myList=new LinkedList();
		

		myList.add(5);

		//myList.add("Hello");

		myList.add(new Date());
		myList.add(7);
		myList.add(8);
		int sum=0;
		for(Integer o:myList) {
			sum+=o;
		}
		

		System.out.println(myList);

		myList.add(2, "Welcome");

		System.out.println(myList);

		System.out.println(myList.indexOf("Welcome"));

		System.out.println(myList.contains("Hello"));

//		myList.remove(2);

		System.out.println(myList);

		myList.set(1, "New Element" );

		System.out.println(myList);

		//Iterate with loop

		System.out.println("Print with loop");

		for(Object i:myList)

			System.out.println(i);

		System.out.println("Print with Iterator");

		Iterator it=myList.iterator();

		while(it.hasNext())

			System.out.println(it.next());
		
		Set mySet=new HashSet();
		mySet.add(1);
		mySet.add(2);
		mySet.add(1);
		mySet.add(1);
		mySet.add(1);
		System.out.println(mySet);
		
		

	}

 

}