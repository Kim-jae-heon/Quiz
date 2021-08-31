package quiz03;

public class StudentMain {
	
	public static void main(String[] args) {
		/*
		 * 멤버변수
		 * name - 학생이름
		 * no - 학생번호
		 * kor - 국어점수
		 * eng - 영어점수
		 * math - 수학점수
		 * 
		 * 생성자
		 * 멤버변수 5개를 초기화하는 생성자
		 * 
		 * getTotal() - 국어 영어 수학 점수를 모두 더해서 합계 반환
		 * getAvg() - 총점을 나눈 평균을 반환(단, 소수점 2자리까지)
		 * 
		 * main에서는 학생의 2명을 각각 생성하고 두 학생의 평균합을 출력하세요
		 */
		
		Student s1 = new Student("김재헌", 1, 95, 90, 95);
		Student s2 = new Student("홍길동", 2, 90, 97, 88);
		
		s1.getTotal();
		s2.getTotal();
		
		System.out.println("===========");
		System.out.println(s1.getAvg());
		System.out.println(s2.getAvg());
	}
}
