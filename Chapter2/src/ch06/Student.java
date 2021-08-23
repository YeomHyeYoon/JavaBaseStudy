package ch06;

public class Student {
	
	public int studentNumber;
	public String studentName;
	public int grade;
	
	//매개변수가 없는 생성자
	public Student() {
		
	}
	
	//매개변수가 있는 생성자
	public Student(int studentNumber , String studentName , int grade) {
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
	}
	
	
	public String showStudentInfo() {
		
		return studentName + "학생의 학번은" + studentNumber + "이고," + grade +"학년입니다";
	}

}
