package quiz;

import java.util.Scanner;

public class B17_CountRandomeFruit {

	public static void main(String[] args) {
		/*
		  1. 사용자로부터 배열의 크기를 입력받는다
		  
		  2. 해당 크기만큼의 배열에 랜덤 과일 문자열을 저장한다
		  		(랜덤으로 등장하는 과일 : apple, banana, kiwi, orange, peach, strawberry, pineapple)
		  		
		  3. 각 과일이 몇 번 등장했는지 모두 기록하고 출력
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.print(" 해당 숫자만큼의 랜덤으로 과일이 나옵니다 >> ");
		int input = sc.nextInt();
		
		String[] fruit = new String[] { "apple", "banana", "kiwi", "orange", "peach", "strawberry", "pineapple" };
		
		
		System.out.println(fruit[input]);
		
		
		/*
		for (int i = 0; i < fruit.length(); ++i) {
			
			char ch = fruit.charAt(i);
			
			System.out.println(fruit[Math.random()]);
			
			if (ch >= 'A' && ch <= 'Z') {
				fruit[ch - 'A']++; // 26개의 방 번호를 부여받는 과정
				
				
				
임의의 숫자를 입력하할때

예시로 10을 입력하면

키위가 4 바나나3 딸기 3
			*/	
				
		
		
	}

}
