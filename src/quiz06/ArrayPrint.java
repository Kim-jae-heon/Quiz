package quiz06;

public class ArrayPrint {
	
	//Arrays.toString기능을 따라해보기 (int배열, String배열, Char배열 만들기)
	//배열 내부의 요소를 문자열의 형태로 가로로 출력해주는 메서드를 오버로딩
	
	String aPrint(int[] a) {
		String str = "";
		for(int i = 0; i < a.length; i++) {
			str += a[i]+ " ";
		}
		System.out.print("["+str+"]");
		return str;
	}
	
	String aPrint(String[] a) {
		String str = "";
		for(int i = 0; i < a.length; i++) {
			str += a[i]+ " ";
		
		//if(arr.length - 1 == i) break;
		//str += ", ";
		}
		System.out.print("["+str+"]");
		return str;
	}
	
	String aPrint(char[] a) {
		String str = "";
		for(int i = 0; i < a.length; i++) {
			str += a[i] + " ";
		}
		System.out.print("["+str+"]");
		return str;
	}
}
