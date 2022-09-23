/*
 * Define a Student class (roll number, name, percentage). Define a default and parameterized
 *  constructor. Keep a count of objects created. Create objects using parameterized 
 *  constructor and display the object count after each object is created.
 *   (Use static member and method). Also display the contents of each object.  
 */
import java.io.*;
class student{
	int rollNo;
	String name;
	float per;
	static int count=0;
	public student() {
		rollNo=0;
		name=null;
		per=0.0f;
		
	}
	public student(int rollNo,String name,float per) {
		this.rollNo=rollNo;
		this.name=name;
		this.per=per;
		count++;
	}
	public static void count() {
		System.out.println("Object " + (count) + " created");
	}
	public void display() {
		System.out.println("Roll Number:" +rollNo);
		System.out.println("Name:" +name);
		System.out.println("Percentage:" +per);
		System.out.println("-----------------------------");
	}
}
public class studentMain {

	public static void main(String[] args)  throws IOException{
		student s1=new student(1,"Rusher",55.90f);
		student.count();
		student s2=new student(2,"Raju",85.90f);
		student.count();
		student s3=new student(3,"Tech",95.90f);
		student.count();
		s1.display();
		s2.display();
		s3.display();
		
		

	}

}
