
package quiz;


import java.util.Scanner;

public class B03_celltoFahr {

	public static void main(String[] args) {
		
		
		//사용자로부터 섭씨 온도를 입력받으면
		//화씨 온도로 변환하여 출력해주는 프로그램을 만들어보세요
		// (변환 공식은 구글 검색, 출력은 소수 첫째 자리 까지)
		
		Scanner sc = new Scanner(System.in);
				
		double cel;
		double fahr;
		
		System.out.print("섭씨(°C) 온도 입력하세요 > ");
		
		cel = sc.nextInt();		
		fahr = (cel * 9/5) + 32;
				
		System.out.printf("%.1f°C는 %.1f°F입니다.", cel, fahr);
		
		/*
		내가 한 것
		Scanner sc = new Scanner(System.in);
		
		final double FAHRENHEIT = ((2d * 9) /5) + 32;
		
		System.out.print("섭씨 온도 입력해주세요. 화씨 온도로 계산됩니다. (°C->°F) >>> ");
		
		double celSius = sc.nextInt();
		double FAH = celSius * FAHRENHEIT;
		
		System.out.printf("%d섭씨 온도는(°C) %.2f 화씨 온도(°F)입니다.", celSius, FAH);
		*/
		
		
	}

}
