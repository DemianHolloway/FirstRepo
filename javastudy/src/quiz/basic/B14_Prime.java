package quiz.basic;

import java.util.Scanner;

public class B14_Prime {

	public static void main(String[] args) {
		/*
		 	사용자로부터 숫자를 입력받으면
		 	1부터 입력한 숫자 사이에 존재하는 소수를 모두 출력해보세요
		 	
		 	* 소수 : 1과 자기 자신으로만 나누어 떨어지는 수
		 		ex) 7, 11, 13, 17 . . .
		 */
		
		System.out.print("소수 찾기 >> ");
		int input = new Scanner(System.in). nextInt();
		
		//13 : 1, 13
		// 30 : 1, 2 , 3 , 5 , 6 .. 30
		
		for (int check = 2; check <= input; ++check) {
			
			int cnt = 0;
			
			// 1과 자기자신을 제외하고 검사를 진행하면
			// cnt가 발생하자마자 소수가 아님을 알 수 있다
			
			for (int div = 2; div < Math.sqrt(check); ++div) {
				
				if (check % div == 0) {
					System.out.printf("검사하는 숫자[%d]는 [%d]로 나누어 떨어졌습니다.\n", check, div);
					System.out.println("\t소수가 아닙니다.");
					cnt++;
					break; // 검사를 더 진행할 필요가 없다
				}
		}
		
		// System.out.printf("\t[%d]의 약수는 [%d]개 입니다. \n", check, cnt);
		
		if (cnt == 0) {
			System.out.printf("[%d]는 소수입니다.");
		
		System.out.println("----------------------------");
		
			}
		}
	}
}

		/*
		내가 한 얼레벌레...
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문장 >> ");
		String prime = sc.next();
		
		for(int i = 2; i <= prime; ++i) {	
			
				for(int i = 2; i <= prime; ++prime) {
					
					
					System.out.printf(" 1부터 %d 사이의 모든 소수: " + i);
				
		
					
					
					
				}
			}
	*/

