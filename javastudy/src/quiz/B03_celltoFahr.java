
package quiz;


import java.util.Scanner;

public class B03_celltoFahr {

	public static void main(String[] args) {
		
		
		//����ڷκ��� ���� �µ��� �Է¹�����
		//ȭ�� �µ��� ��ȯ�Ͽ� ������ִ� ���α׷��� ��������
		// (��ȯ ������ ���� �˻�, ����� �Ҽ� ù° �ڸ� ����)
		
		Scanner sc = new Scanner(System.in);
				
		double cel;
		double fahr;
		
		System.out.print("����(��C) �µ� �Է��ϼ��� > ");
		
		cel = sc.nextInt();		
		fahr = (cel * 9/5) + 32;
				
		System.out.printf("%.1f��C�� %.1f��F�Դϴ�.", cel, fahr);
		
		/*
		���� �� ��
		Scanner sc = new Scanner(System.in);
		
		final double FAHRENHEIT = ((2d * 9) /5) + 32;
		
		System.out.print("���� �µ� �Է����ּ���. ȭ�� �µ��� ���˴ϴ�. (��C->��F) >>> ");
		
		double celSius = sc.nextInt();
		double FAH = celSius * FAHRENHEIT;
		
		System.out.printf("%d���� �µ���(��C) %.2f ȭ�� �µ�(��F)�Դϴ�.", celSius, FAH);
		*/
		
		
	}

}
