package exc.java.collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import exc.java.models.Student;

public class GenericArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		
		ArrayList<String> list1=new ArrayList<>();
		/*
		ArrayList<String> list2=new ArrayList<>();
		List list3=new ArrayList<String>();
		List<String> list4=new ArrayList<>();
		*/
		String [] arrStr={"sundaram","chancahl","Sukhram","Geeta","Dimple"};
		for(String str:arrStr){
			list.add(str);
		}
		
		//Itration of arraylist using Iteartor 
		
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		//Itration of arraylist using for each loop
		
		for(String str:list){
			System.out.println(str);
		}
		
		//User-Define Object in Arraylist 
		ArrayList<Student> listofStudent=new ArrayList<>();
		Student s1=new Student(101,"Sundaram",23);
		Student s2=new Student(102,"Chanchal",20);
		Student s3=new Student(103,"Dimple",21);
		
		listofStudent.add(s1);
		listofStudent.add(s2);
		listofStudent.add(s3);
		
		for(Student st:listofStudent){
			list1.add(st.getName());
			System.out.println(st.getRollNo() +st.getName() + st.getAge());
			
		}
		
		list1.addAll(list);
		System.out.println("After adding list1 , list objects :-");
		
		for(String str:list1){
			System.out.println(str);
		}
/*
		System.out.println("After removing list1 , list objects :-");
		
		list1.removeAll(list);
		for(String str:list1){
			System.out.println(str);
		}
	*/	
		System.out.println("After retaining list1 , list objects :-");
		list1.retainAll(list);
		for(String str:list1){
			System.out.println(str);
		}
		
		

	}

}
