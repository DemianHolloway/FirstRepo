package quiz;


import java.util.Scanner;

public class B03_GuessAge {

	public static void main(String[] args) {
		// 사용자로부터 태어난해와 올해의 년도를 입력받으면
		// 그 사람의 한국 나이를 계산하여 몇 살인지 알려주는 프로그램을
		// 만들어보세요
		
		Scanner sc = new Scanner(System.in);
		System.out.println("사용자의 태어난 해를 기입해주세요 > ");
		int a = sc.nextInt();
		
		System.out.println("사용자의 태어난 해는" + a + "입니다.\n\n올해의 년도를 기입해주세요 >");
		int b = sc.nextInt();

		System.out.println("사용자의 한국 나이는 " + ( b - a ) +"입니다.");

	}

}
