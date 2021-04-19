package quiz;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class C13_InputRightThing {

	
	/*
	  사용자로부터 숫자를 제대로 입력받을때까지 계속 입력받는 프로그램을 만들어보세요
	  (잘못된 값이 입되어도 강제종료 되지 않고, 올바른 값이 입력되면 출력 후 프로그램이 종료)
	 
	 */
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		
//		while (true) {
//			try {
//				System.out.print("반드시 숫자만 입력해주세요!");
//				int num = sc.nextInt();
//				System.out.println("입력하신 값은" + num +"입니다.");
//				break;
//			} catch (InputMismatchException e) { //인풋 어쩌고는 클래스 'e'에는 변수명
//				System.out.println("잘못된 입력입니다. 숫자를 입력하세요");
//				String stuck = sc.nextLine();
//				System.out.println("걸려있던걸 뺌:" + stuck);
//			}
//		}
		
//		System.out.println("프로그램이 정상적으로 종료되었습니다.");
//	}
	static Scanner sc = new Scanner(System.in);
		
	public static void main(String[] args) {	
		int a = inputInt("숫자 > ");
		int b = inputInt("두 번째 숫자 > ");
		
	System.out.println("input 함수로 입력받은 값: " + a);
	System.out.println("프로그램이 정상적으로 종료되었습니다.");
	}
	
	public static int inputInt(String message) {
		int num;
		
		while (true) {
			try {
				System.out.println(message);
				num = sc.nextInt();
				break;
			} catch (InputMismatchException e) {
				sc.nextLine();
			}
		}
	
		// sc.close(); // 더 이상 쓰지 않을 스캐너를 삭제 (System.in)을 
		
		sc.close();
		return num;
	}
}
