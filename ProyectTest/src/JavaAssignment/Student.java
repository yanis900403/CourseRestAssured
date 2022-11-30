/**
 * 
 */
package JavaAssignment;

/**
 * @author Yanis
 *
 */
public class Student {

    int age;
	int roll_No;
	
	public void display1() {
		System.out.println("Welcome to all of you");
	}

	public void display2() {
		System.out.println("Automation is very easy");
	}
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student=new Student();
		student.display1();
		student.display2();
		student.age=222;
		System.out.println(student.age);
		student.age=333;
		System.out.println(student.age);
		System.out.println(student.roll_No);
	}

}
