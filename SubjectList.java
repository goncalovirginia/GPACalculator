
public class SubjectList {

	private Subject[] subjects;
	private int counter;
	
	public SubjectList() {
		subjects = new Subject[100];
		counter = 0;
	}
	
	public void addSubject(int credits, int grade, String name) {
		subjects[counter++] = new Subject(credits, grade, name);
	}
	
	public Subject[] getSubjectList() {
		return subjects;
	}
	
	public int getCounter() {
		return counter;
	}
	
}
