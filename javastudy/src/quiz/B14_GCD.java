package quiz;

public class B14_GCD {

	public static void main(String[] args) {
		/*
		 	두 숫자를 입력받고 두 숫자의 최대공약수를 구해보세요
		 	
		 	*최대공약수 : 두 숫자의 공약수 중 가장 큰 공약수
		 */
		
		int num1 = 30, num2 = 50;
		int gcd = 1;
		
		
		int min = Math.min(num1, num2);
		int max = Math.max(num1, num2);
		
		for(int i = min; i >= 1; --i) {
			
			if (min % i == 0 && max % i == 0) {
				gcd = i;
				break;
				
			}
		}
		System.out.println("gcd: " + gcd);
	}
}		
		
		/*
		System.out.println("(A의 값을 입력하세요 >> ");
		int input_a = new Scanner(System.in).nextInt();
		
		System.out.println("(B의 값을 입력하세요 >> ");
		int input_b = new Scanner(System.in).nextInt();
		
		//13 : 1, 13
		// 30 : 1, 2 , 3 , 5 , 6 .. 30
		
		for (int check = 2; check <= input_a; ++check) {
			
			int cnt = 0;
			
			// 유클리드 공식...
			
			for (int div = 2; div < Math.sqrt(check); ++div) {
				
				if (check % div == 0) {
					System.out.printf("A의 값[%d]와 B의 값[%d]의 최대공약수 : \n", check, div);
					System.out.println("\t최대공약수가 아닙니다.");
					cnt++;
					break; // 검사를 더 진행할 필요가 없다
				}
		}
		
		// System.out.printf("\t[%d]의 약수는 [%d]개 입니다. \n", check, cnt);
		
		if (cnt == 0) {
			System.out.printf("[%d]는 최대공약수입니다.");
		}
		
		System.out.println("----------------------------");
*/
		