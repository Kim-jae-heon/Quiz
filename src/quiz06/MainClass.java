package quiz06;

public class MainClass {
	
	public static void main(String[] args) {
		
		ArrayPrint arrP = new ArrayPrint();
		
		int[] arr = {1,2,3,4,5};
		String[] sArr = {"홍길동", "홍길자", "홍길순"};
		char[] cArr = {'a', 'b', 'A', 'B'};
		
		arrP.aPrint(arr);
		System.out.println();
		arrP.aPrint(sArr);
		System.out.println();
		arrP.aPrint(cArr);
	}
}
