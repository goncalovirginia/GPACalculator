
public class SubjectIterator {

	private Subject[] subjects;
	private int counter, nextSubject;
	
	public SubjectIterator(Subject[] subjects, int counter) {
		this.subjects = subjects;
		this.counter = counter;
		nextSubject = 0;
	}
	
	public boolean hasNext() {
		return nextSubject < counter;
	}
	
	public Subject next() {
		return subjects[nextSubject++];
	}
	
}
