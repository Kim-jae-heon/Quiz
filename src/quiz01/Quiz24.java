package quiz01;

import java.util.Arrays;

public class Quiz24 {
	public static void main(String[] args) {
		//1. 모든 메서드를 생성 후 main에서 호출해서 사용하세요
		
		method1();
		System.out.println(method2("ㅎㅇ"));
		System.out.println(method3(1,2,3.5));
		System.out.println(method4(3));
		System.out.println(method5("가",5));
		System.out.println(maxNum(5,6));
		System.out.println(abs(-6));
		char[] c = {'A', 'B', 'C'};
		System.out.println(method6(c));
		
		int[] iArr = {1,2,3,4,5};
		int result4 = method7(iArr);
		System.out.println(result4);
		
		String[] sArr = method8("a","b");
		System.out.println(Arrays.toString(sArr));
	}
	
	static void method1() {
		System.out.println("안녕");
	}
	
	static String method2(String a) {
		return a;
	}
	
	static double method3(int a, int b, double c) {
		return a+b+c;
	}
	
	static String method4(int a) {
		if(a%2==0) {
			return "짝수";
		} else {
			return "홀수";
		}
	}
	
	static String method5(String a, int b) {
		
		String str = "";
		
		for(int i = 1; i <= b; i++) {
			str += a;
		}
		return str;
	}
	
	static String maxNum(int a, int b) {
		if(a > b) {
			return "큰 수는"+a;
		} else if(a < b) {
			return "큰 수는"+b;
		} else {
			return "동수입니다";
		}
	}
	
	static int abs(int a) {
		if(a < 0) {
			a = a*-1;
		} 
		
		return a;
	}
	
	static String method6(char[] a) {
		//char배열의 요소를 문자열로 모두 붙여서 리턴
		
		String str = "";
		for(int i = 0; i < a.length; i++) {
			str += a[i];
		}
		
		return str;
		/*static String method6(Char[] arr){	
		 * String s = "";
		 * 	for(char c : arr) {
		 * 		s += c;
		 * 	}
		 * }		//문자열이 잘 이해가 안감. 문자열 전체적으로. 
		 */
	}
	
	static int method7(int[] a) {
		//배열 요소의 합을 리턴
		int sum = 0;
		for(int i = 0; i < a.length ; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	static String[] method8(String a, String b) {
		//매개변수를 배열에 저장하여 배열 리턴
		String[] sArr = {a, b};
		return sArr;
	}
}
