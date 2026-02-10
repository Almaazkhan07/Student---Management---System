public class Student1 extends Person {
	private int age;
	private String course;

	public Student1(int id, String name, int age, String course){
		super(id, name);
		this.age=age;
		this.course=course;
	}

	public void displayStudent(){
		System.out.println(id + " | " + name + " | " + age + " | " + course);
	}

	public int getId(){
		return id;
	}
}