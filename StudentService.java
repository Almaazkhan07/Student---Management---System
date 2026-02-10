import java.util.ArrayList;

public class StudentService {
	ArrayList<Student1> students = new ArrayList<>();

	public void addStudent(Student1 s) {
		students.add(s);
		System.out.println("Student added Successfully !");
	}

	public void viewStudents(){
		if (students.isEmpty()){
			System.out.println("No Student Found. ");
			return;
		}
		for (Student1 s : students){
			s.displayStudent();
		}
	}
	public void searchStudent(int id) {
		for(Student1 s : students) {
			if (s.getId()==id) {
				s.displayStudent();
				return;
			}
		}
		System.out.println("Student not found.");
	}
}