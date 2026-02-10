import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StudentService service = new StudentService();

		int choice;

		do {
			System.out.println("\n-----Student Management Systwem-------");
			System.out.println("1. Add Student");
			System.out.println("2. View Student");
			System.out.println("3. Search Student");
			System.out.println("0. Exit");

			System.out.println("Enter Choice : ");
			choice = sc.nextInt();

			switch (choice) {
			
			case 1: 
				System.out.println("Enter Id : ");
				int id = sc.nextInt();
				sc.nextLine();

				System.out.println("Enter Name : ");
				String name = sc.nextLine();

				System.out.println("Enter Age : ");
				int age = sc.nextInt();
				sc.nextLine();

				System.out.println("Enter Course : ");
				String course = sc.nextLine();

				Student1 s = new Student1(id, name, age, course);
				service.addStudent(s);
				break;

			case 2:
			    service.viewStudents();
			break;	

		    
		    case 3:
		    	System.out.print("Enter Student ID: ");
		    	int searchId = sc.nextInt();

		    	service.searchStudent(searchId);
		    	break;
		   

		    case 0:
		    	
		    	System.out.println("Thank you!! ");
		    	break;

		    	default:
		    	System.out.println("Invalid Choice! ");
		    	}
		    } 

		    while (choice !=0 );
		    sc.close();	

		}
}