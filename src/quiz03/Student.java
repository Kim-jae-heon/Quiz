package quiz03;

public class Student {
	String name;
	int no;
	int kor;
	int eng;
	int math;
	
	Student(String sName, int sNo, int sKor, int sEng, int sMath){
		name = sName;
		no = sNo;
		kor = sKor;
		eng = sEng;
		math = sMath;
	}
	
	int sum = 0;
	void getTotal(){
		sum = kor + eng + math;
		System.out.println(sum);
	}
	//같은 클래스 안의 메서드는 그냥 사용하면 된다.
	
	double avg = 0;
	double rest = 0;
	double getAvg() {
		rest = (double)(sum)/3;
		avg = (int)(rest*100);
//		avg = sum/3 + rest;
		
		return avg/100;
	}
}
