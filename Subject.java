
public class Subject {
	
	private String name;
	private int credits, grade;

	public Subject(int credits, int grade, String name) {
		this.credits = credits;
		this.grade = grade;
		this.name = name;
	}
	
	public int getCredits() {
		return credits;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public String getName() {
		return name;
	}
	
}
