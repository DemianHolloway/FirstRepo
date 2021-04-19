package quiz;


import java.util.Scanner;

public class B03_wonToDollar {

	public static void main(String[] args) {
		
		//한국 돈을 입력하면 미국 달러로 환전해주는 프로그램을 만들어보세요
		//(현재 환율은 구글 검색, 소수 둘째 자리까지 출력, 환전 수수료 1.76%)
		
		Scanner sc = new Scanner(System.in);
		
		// final이 함께 선언된 변수는 나중에 값을 변경할 수 없다
				final double WON_TO_DOLLAR = 0.00089;
		
				System.out.print("한국 돈을 입력해주세요. 달러로 바꿔드립니다. (수수료 1.75%) > ");
				
				int korMoney = sc.nextInt();
				
				double usd = korMoney * WON_TO_DOLLAR;
				
				System.out.printf("%d원은 %.2fUSD입니다.\n", korMoney, (usd * 0.9825));
				
				/*
				쌤이 한 
				Scanner sc = new Scanner(System.in);
				final double WON_TO_DOLLAR = 0.00089;
		
				System.out.print("한국 돈을 입력해주세요. 달러로 바꿔드립니다. (수수료 1.75%) > ");
				
				int korMoney = sc.nextInt();
				
				double usd = korMoney * WON_TO_DOLLAR;
				double exchange_fee = usd * 0.0175;
				
				system.out.println(Math.round(usd * 0.9825 * 100) / 100.0 + "$");
				
				*/
				
				/*
				내가 한 부분들...
				
		System.out.println("환율을 계산합니다.(KRW)->(USD)\n대한민국(KRW) 통화를 입력해주세요.(단, 1원 이상) () > ");
		
		int won = sc.nextInt();
		double dollar = (won * 0.00089);
		
		System.out.println(won + "원은 $" + Math.round(dollar * 1000) / 100.0 + "입니다.(환전 수수료 1.76%)");
		System.out.println("환전 시 예상금액 : $ "  -(Math.round(dollar * 1000) / 100.0) * 0.9825);

				 */

	}

}
