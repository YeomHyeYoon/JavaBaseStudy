package ch04;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student();
		studentLee.setStudentName("Lee");
		studentLee.studentId = 12345;
		studentLee.address = "서울 강남구";
		
		studentLee.showStudentInfo();
		//주소 출력
		System.out.println(studentLee);

	}

}
