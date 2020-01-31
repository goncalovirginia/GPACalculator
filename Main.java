
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Manager manager = new Manager();
		String option;
		
		help();
		
		do {
			option = readOption(in);
			executeOption(in, manager, option);
		} while (!option.equals("EXIT"));
		

	}
	
	private static String readOption(Scanner in) {
		return in.next().toUpperCase();
	}
	
	private static void executeOption(Scanner in, Manager manager, String option) {
		switch(option) {
		case "HELP":
			help();
			break;
		case "ADD":
			addSubject(in, manager);
			break;
		case "CALCULATE":
			calculate(manager);
			break;
		default:
			System.out.println("Invalid Command.");
		}
	}
	
	private static void help() {
		System.out.println("HELP - Shows the list of possible commands.");
		System.out.println("ADD <Credits> <Final Grade> <Subject Name> - Adds a new subject.");
		System.out.println("CALCULATE - Outputs all inputted Subjects (and corresponding information) and final GPA.");
	}
	
	private static void addSubject(Scanner in, Manager manager) {
		 manager.addSubject(in.nextInt(), in.nextInt(), in.next()+in.nextLine());
		 
		 System.out.println("Subject added.");
	}
	
	private static void calculate(Manager manager) {
		SubjectIterator subjects = manager.newSubjectIterator();
		
		while (subjects.hasNext()) {
			Subject subject = subjects.next();
			System.out.println(subject.getName() + " - Credits: " + subject.getCredits() + " Grade: " + subject.getGrade());;
		}
		
		System.out.println("GPA: " + manager.calculate());
	}

}
