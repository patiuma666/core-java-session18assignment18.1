package assignment18;//created a package name as assignment18

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {//created class ArrayListDemo

	public static void main(String[] args) { //created main method
		
		//here I'm creating an array list to add String elements so I made it of string type 
	      
		//ArrayList<String>() : this will create an empty list with initial capacity of 5.
		
		ArrayList<String> studentList = new ArrayList<String>();
		
		studentList.add("Uma Maheshwari"); //here I'm adding 5 elements to the array list 
		studentList.add("Prashanti");          //  we are using the add method to add objects to the array list:
		studentList.add("Mounika");
		studentList.add("Supriya");
		studentList.add("Archana");
		
		 Iterator <String> listIterator = studentList.iterator();//getting Iterator from array list to traverse elements  
	   
		 while (listIterator.hasNext()){       // object next() :it returns the element and moves the cursor pointer to next element.
			
			 String student = (String)listIterator.next(); //traversing elements of ArrayList object  
			
			 if (student.equals("Supriya")){
				 listIterator.remove();
				 System.out.println("Supriya is removed");//here in the output it shows supriya instead of we removed it after this interation it will be removed
			 }
			 
	       System.out.println(student);  
		
	  }

   }
}