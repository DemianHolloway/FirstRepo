package quiz;

public class B14_GCD {

	public static void main(String[] args) {
		/*
		 	�� ���ڸ� �Է¹ް� �� ������ �ִ������� ���غ�����
		 	
		 	*�ִ����� : �� ������ ����� �� ���� ū �����
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
		System.out.println("(A�� ���� �Է��ϼ��� >> ");
		int input_a = new Scanner(System.in).nextInt();
		
		System.out.println("(B�� ���� �Է��ϼ��� >> ");
		int input_b = new Scanner(System.in).nextInt();
		
		//13 : 1, 13
		// 30 : 1, 2 , 3 , 5 , 6 .. 30
		
		for (int check = 2; check <= input_a; ++check) {
			
			int cnt = 0;
			
			// ��Ŭ���� ����...
			
			for (int div = 2; div < Math.sqrt(check); ++div) {
				
				if (check % div == 0) {
					System.out.printf("A�� ��[%d]�� B�� ��[%d]�� �ִ����� : \n", check, div);
					System.out.println("\t�ִ������� �ƴմϴ�.");
					cnt++;
					break; // �˻縦 �� ������ �ʿ䰡 ����
				}
		}
		
		// System.out.printf("\t[%d]�� ����� [%d]�� �Դϴ�. \n", check, cnt);
		
		if (cnt == 0) {
			System.out.printf("[%d]�� �ִ������Դϴ�.");
		}
		
		System.out.println("----------------------------");
*/
		