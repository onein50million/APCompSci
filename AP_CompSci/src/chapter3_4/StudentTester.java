package chapter3_4;

public class StudentTester {

	public static void main(String[] args) {
		
		Student student = new Student("person", 100, 5);
		System.out.println(student.getName());
		System.out.println(student.getTotalScore());
		System.out.println(student.getAverageScore());
		student.addQuiz(50);
		System.out.println(student.getAverageScore());
		
	}

}
