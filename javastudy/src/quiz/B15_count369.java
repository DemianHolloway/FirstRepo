package quiz;

import java.util.Scanner;

public class B15_count369 {

	public static void main(String[] args) {
		/*
		 	����ڷκ��� ������ �ϳ� �Է¹ް�
		 	�ش� ���ڳ��� 369 ������ ����ȴٸ� �ڼ��� �� �� �� �ľ��ϴ��� �������
		 */
		// 1. ���ڿ��� Ǯ��
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("hello : " + 123);
//		System.out.println("" + 123);
//		System.out.println("Integer.toString(123));
		
		System.out.print("���� >> ");
		int input = sc.nextInt();
		int cnt = 0;
		
		for (int i = 1; i <= input; ++i) {
			String num_str = "" + i;

			
			System.out.print(i + ":> ");
			
			for (int j = 0; j < num_str.length(); ++j) {
				char num_ch = num_str.charAt(j);
				
				if(num_ch == '3' || num_ch == '6' || num_ch == '9' ) {
					cnt++;
					System.out.print("¦");
				}
				
			}
			System.out.println();
			}
		System.out.print("�� �ڼ� Ƚ���� : " + cnt + "ȸ");
		
		//2. ������ Ǯ��
	}
}
		
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ڼ� Ƚ�� >> ");
		
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

