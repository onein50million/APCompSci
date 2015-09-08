package chapter3_4;

public class Student {
	
	String name;
	float score;
	int quizCount;
	
	public Student(String name, int score, int quizCount){
		
		this.name = name;
		this.score = score;
		this.quizCount = quizCount;
		
	}
	
	public String getName() {
		
		return name;
		
	}
	
	public void addQuiz(int score) {
		
		this.score += score;
		this.quizCount++;
		
	}
	
	public float getTotalScore() {

		return this.score;
		
	}
	
	public float getAverageScore() {
		
		return this.score/this.quizCount;
		
	}

}
