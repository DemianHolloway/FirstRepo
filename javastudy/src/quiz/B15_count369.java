package quiz;

import java.util.Scanner;

public class B15_count369 {

	public static void main(String[] args) {
		/*
		 	사용자로부터 정수를 하나 입력받고
		 	해당 숫자끼리 369 게임이 진행된다면 박수를 총 몇 번 쳐야하는지 세어보세요
		 */
		// 1. 문자열로 풀기
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("hello : " + 123);
//		System.out.println("" + 123);
//		System.out.println("Integer.toString(123));
		
		System.out.print("정수 >> ");
		int input = sc.nextInt();
		int cnt = 0;
		
		for (int i = 1; i <= input; ++i) {
			String num_str = "" + i;

			
			System.out.print(i + ":> ");
			
			for (int j = 0; j < num_str.length(); ++j) {
				char num_ch = num_str.charAt(j);
				
				if(num_ch == '3' || num_ch == '6' || num_ch == '9' ) {
					cnt++;
					System.out.print("짝");
				}
				
			}
			System.out.println();
			}
		System.out.print("총 박수 횟수는 : " + cnt + "회");
		
		//2. 정수로 풀기
	}
}
		
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("박수 횟수 >> ");
		
		int i = sc.nextInt();

		int count = 0;
		
		while (i++ =< 369) {
			if(i % 3 == 0) {
				count += i;
				
				if(i % 3 == 0) {
					count += i;
			}
		}
			
			System.out.println(count);
		 */

