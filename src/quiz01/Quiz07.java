package quiz01;

import java.util.Scanner;

public class Quiz07 {
	public static void main(String[] args) {
		// 1. 메뉴를 보여준 후, Scanner로 해당 메뉴를 입력 받으세요.다만, 배열은 아니다.
		// 2. 없는 메뉴 라면"~은 메뉴에 없습니다"를 출력하세요
		// 3. switch구문을 이용하세요

		Scanner scan = new Scanner(System.in);
		String menu1 = "수박";
		String menu2 = "사과";
		String menu3 = "멜론";
		String menu4 = "포도";
		String menu5 = "귤";
		System.out.println("구입할 메뉴는?");
		System.out.println("[" + menu1 + "," + menu2 + "," + menu3 + "," + menu4 + "," + menu5 + "] 중 골라주세요.");
		System.out.print(">");
		String menu = scan.next();

		switch (menu) {
		case "수박":
			System.out.println("수박의 가격은 2만원 입니다.");
			break;
		case "사과":
			System.out.println("사과의 가격은 1500원 입니다.");
			break;
		case "멜론":
			System.out.println("멜론의 가격은 8,000원 입니다.");
			break;
		case "포도":
			System.out.println("포도의 가격은 3,000원 입니다");
			break;
		case "귤":
			System.out.println("귤의 가격은 1,200원 입니다");
			break;
		default:
			System.out.println(menu + "은(는) 메뉴에 없습니다.");
			System.out.println("다시 입력해주세요.");
			break;
		}
		scan.close();
	}
}
