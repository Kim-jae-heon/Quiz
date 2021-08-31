package quiz01;

public class Quiz16 {
	public static void main(String[] args) {
		
		//1. 중첩 반복문을 이용한 피라미드, 별모양 찍기를 많이 한다.
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****		→ 이런식으로
		 * ******
		 * *******
		 * 
		 * 
		 * 혹은
		 * 
		 * 				*
		 * 			   ***
		 * 			  *****
		 *           *******
		 *          *********	→ 이런 것도 있을 수 있다.
		 *         ***********
		 */
		
		
		for(int i = 1; i <= 7; i++) { //
				
			for(int j = 1; j <= i; j++) { //출력의 용도
			//if문 안에 i와 j를 왜 써줄 필요가 없지..?
				if(i==j) {
					System.out.print("*"+"\n");
				} else if(j < i) {
					System.out.print("*");
				}
			}
		}
		
		System.out.println("==========================");
		
		int star = 7;
		for(int i1 = 1; i1 <= star; i1++) {
			for(int j1 = 1; j1 <= star + 1 - i1; j1++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("==========================");
		for(int i2 = 1; i2 <= star; i2++) {
			for(int j2 = 1; j2 <= star - i2; j2++) {
				System.out.print(" ");
			}
			
			for(int j2 = 1; j2 <= i2*2-1; j2++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
