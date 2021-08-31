package quiz01;

public class Quiz17 {
	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {
			System.out.println();
			for (int j = 1; j <= 3; j++) {
				System.out.print(j + " x " + i + " = " + i * j + "\t");
			}
		}
		System.out.println();
		for (int i = 1; i <= 9; i++) {
			System.out.println();
			for (int j = 4; j <= 6; j++) {
				System.out.print(j + " x " + i + " = " + i * j + "\t");
			}
		}
		System.out.println();
		for (int i = 1; i <= 9; i++) {
			System.out.println();
			for (int j = 7; j <= 9; j++) {
				System.out.print(j + " x " + i + " = " + i * j + "\t");
			}
		}
	}
	/*
	 * for(int i = 1; i <= 9; i+=3 ) {
	 * 	for(int j = 1; j <= 9; j++) {
	 * 		System.out.print(i + "x" + j + "=" + i*j + "\t");
	 * 		System.out.print((i+1) + " x " + j + " = " + (i+1) * j + "\t");
	 * 		System.out.print((i+2) + " x " + j + " = " + (i+2) * j + "\t");
	 * 		System.out.println();	
	 * 
	 * 		//printf로 쓸 수도 있음
	 * 		//System.out.printf("%d x %d = %d\t %d x %d = %d\t %d x %d = %d \n", i, j, i*j, i+1, j, (i+1)*j, i+2, j, (i+2)*j);
	 * 	}
	 * 
	 * System.out.println();
	 * }
	 */
}
