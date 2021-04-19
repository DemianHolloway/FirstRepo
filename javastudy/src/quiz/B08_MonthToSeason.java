package quiz;

import java.util.Scanner;

public class B08_MonthToSeason {

	public static void main(String[] args) {
		
		/*
		 	사용자로부터 달을 입력받으면 해당하는 계절을 출력해보세요
		 	(Switch-case문을 이용)
		 */
		
		Scanner sc = new Scanner(System.in);

		System.out.print("몇 월? >>");
		
		int month = sc.nextInt();
		String season;
		
		switch (month) {
		case 3 : case 4 : case 5 :
			season = "겨울";
			break;
		case 6 : case 7 : case 8 :
			season = "봄";
			break;
		case 9 : case 10 : case 11 :
			season = "여름";
			break;
		case 12 : case 1 : case 2 :
			season = "가을";
			break;
		default :
			season = "잘못된 계절";
			break;
		}
		System.out.printf("%d월은 [%s]입니다.\n", month, season);
	
			
			/*
			 내가 한 것...
			 int what_month;
		
		System.out.print("1~12월의 계절을 알립니다.>>");
		what_month = sc.nextInt();
		
		switch (what_month) {
		case 3 : case 4 : case 5 :
			System.out.println("[ 봄 ] 입니다.");
			break;
		case 6 : case 7 : case 8 :
			System.out.println("[ 여름 ] 입니다.");
			break;
		case 9 : case 10 : case 11 :
			System.out.println("[ 가을 ] 입니다.");
			break;
		case 12 : case 1 : case 2 :
			System.out.println("[ 겨울 ] 입니다.");
			break;
		}
			 */
				
		
	}

}
