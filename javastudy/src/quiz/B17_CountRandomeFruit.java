package quiz;

import java.util.Scanner;

public class B17_CountRandomeFruit {

	public static void main(String[] args) {
		/*
		  1. ����ڷκ��� �迭�� ũ�⸦ �Է¹޴´�
		  
		  2. �ش� ũ�⸸ŭ�� �迭�� ���� ���� ���ڿ��� �����Ѵ�
		  		(�������� �����ϴ� ���� : apple, banana, kiwi, orange, peach, strawberry, pineapple)
		  		
		  3. �� ������ �� �� �����ߴ��� ��� ����ϰ� ���
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.print(" �ش� ���ڸ�ŭ�� �������� ������ ���ɴϴ� >> ");
		int input = sc.nextInt();
		
		String[] fruit = new String[] { "apple", "banana", "kiwi", "orange", "peach", "strawberry", "pineapple" };
		
		
		System.out.println(fruit[input]);
		
		
		/*
		for (int i = 0; i < fruit.length(); ++i) {
			
			char ch = fruit.charAt(i);
			
			System.out.println(fruit[Math.random()]);
			
			if (ch >= 'A' && ch <= 'Z') {
				fruit[ch - 'A']++; // 26���� �� ��ȣ�� �ο��޴� ����
				
				
				
������ ���ڸ� �Է����Ҷ�

���÷� 10�� �Է��ϸ�

Ű���� 4 �ٳ���3 ���� 3
			*/	
				
		
		
	}

}
