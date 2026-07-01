public class Student {
	int age; 
	String name;
	Student () 
	{
		name = "Vaishnavi";
		age = 22;
	}
	void getInfo ()
	{
		System.out.println("Student Name: " + name);
		System.out.println("Student Age: " + age);
		System.out.println("--------------------------");
	}
	public static void main (String [] args) {
		Student s1 = new Student ();
		s1. getInfo ();
	}
}
