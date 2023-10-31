package org.login;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Employee {
	

	public static void main(String[] args) {
		
		//Create object for list
		List l=new ArrayList();
		
	//1	//To Insert value from the list
		l.add(10);
		l.add("JAVA");
	    l.add(10345678998l);
		l.add(10.234567);
		l.add('M');
		l.add(true);
		l.add(10);
		l.add(10);
		
		System.out.println(l);
		
	//2	//Size
		int size = l.size();
		System.out.println(size);   // 8
		
	//3	//indexOf
		int indexOf = l.indexOf(10);   // what is the index possition of no. 10 in the array list
		System.out.println(indexOf);   // 0
		
	//4	//last indexOf
		int lastindexOf = l.lastIndexOf(10); // last index number in the list on this 10th number
		System.out.println(lastindexOf);   // 7
		
	//5	//Contains
		boolean contains = l.contains(true);  // in this array list contain TRUE 
		System.out.println(contains);  // true
		
	//6	//Remove
		Object remove = l.remove(1);       // in this array list remove index 1st possition value
		System.out.println(l);      // JAVA
		
	//7	//get                        
		Object Object = l.get(0);        // in this array list get index 0(zero / first) possition value 
		System.out.println(Object);   // 10
		
    //8	//For loop
		//indexbased
		
		for(int i=0;i<l.size();i++) {   // for print all the array list values as downorder
		Object Object2 = l.get(i); // change local veritable
		System.out.println(Object2);   
		}  
		
	//9	//Enhanced for loop
		//value based
		
		for (Object a:l) {
		System.out.println(a);
			} 
		
	//10//Similar datatype                 // Combine(join) B array List no's with C array List no's (10(10),20(20),30)
		//Generic 
		
		List<Integer> b = new LinkedList();
		b.add(10);
		b.add(20);
		b.add(30);
		
		 
        List<Integer> c =new ArrayList();    // Combain(join) B array List no's with C array List no's (10(10), 20(20), 30)
		c.add(10);
		c.add(20);   
		

  //12	//Remove all                       // Remove(delete) B array List no's with C array List no's [(10(10), 20(20)], 30)
		
	//	b.removeAll(c);
	//	System.out.println(b);         // Ans is (10-10, 20-20, 30 ) so 30 only print
		
  // 13	//retainAll                     // ADD(join) B array List no's with C array List no's (10(10), 20(20), 30)
		
	//	b.retainAll (c);
	//	System.out.println(b);          // Ans is now add(combine) b+c (10+10, 20+20, (30 not able to combine ) so  print 10, 20 but 
		                                // 30 only will also print (due to 10-10, 20-20,) =30
		
    	List d = new ArrayList();  // ADD(join) B array List no's with C and D array List no's (10(10), 20(20), 30, 40)
		d.add(40);
				
// 15	//add ALL
		
		d.addAll(b);
		System.out.println(d);   // B+C 10, 20, 30, 40
		
// 16	//Clear
		d.clear();                // clear mens NO value in the Array [ ]
		System.out.println(d);  
		
				
		
		}
		
		
	}


