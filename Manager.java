
public class Manager {

	private SubjectList subjects;
	
	public Manager() {
		subjects = new SubjectList();
	}
	
	public void addSubject(int credits, int grade, String name) {
		subjects.addSubject(credits, grade, name);
	}
	
	public SubjectIterator newSubjectIterator() {
		return new SubjectIterator(subjects.getSubjectList(), subjects.getCounter());
	}
	
	public double calculate() {
		int totalSum = 0, totalCredits = 0;
		
		for (int i = 0; i < subjects.getCounter(); i++) {
			totalSum += subjects.getSubjectList()[i].getCredits() * subjects.getSubjectList()[i].getGrade();
			totalCredits += subjects.getSubjectList()[i].getCredits();
		}
		
		return (double)totalSum/totalCredits;
	}
	
}
