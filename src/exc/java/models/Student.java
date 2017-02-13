package exc.java.models;

public class Student {
  int rollNo;
  String Name;
  int age;
  
  public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

  public Student(int rollNo,String Name,int age){
	  this.rollNo=rollNo;
	  this.Name=Name;
	  this.age=age;
  }
}
