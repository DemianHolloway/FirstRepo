package quiz;


import java.util.Scanner;

public class B03_wonToDollar {

	public static void main(String[] args) {
		
		//�ѱ� ���� �Է��ϸ� �̱� �޷��� ȯ�����ִ� ���α׷��� ��������
		//(���� ȯ���� ���� �˻�, �Ҽ� ��° �ڸ����� ���, ȯ�� ������ 1.76%)
		
		Scanner sc = new Scanner(System.in);
		
		// final�� �Բ� ����� ������ ���߿� ���� ������ �� ����
				final double WON_TO_DOLLAR = 0.00089;
		
				System.out.print("�ѱ� ���� �Է����ּ���. �޷��� �ٲ�帳�ϴ�. (������ 1.75%) > ");
				
				int korMoney = sc.nextInt();
				
				double usd = korMoney * WON_TO_DOLLAR;
				
				System.out.printf("%d���� %.2fUSD�Դϴ�.\n", korMoney, (usd * 0.9825));
				
				/*
				���� �� 
				Scanner sc = new Scanner(System.in);
				final double WON_TO_DOLLAR = 0.00089;
		
				System.out.print("�ѱ� ���� �Է����ּ���. �޷��� �ٲ�帳�ϴ�. (������ 1.75%) > ");
				
				int korMoney = sc.nextInt();
				
				double usd = korMoney * WON_TO_DOLLAR;
				double exchange_fee = usd * 0.0175;
				
				system.out.println(Math.round(usd * 0.9825 * 100) / 100.0 + "$");
				
				*/
				
				/*
				���� �� �κе�...
				
		System.out.println("ȯ���� ����մϴ�.(KRW)->(USD)\n���ѹα�(KRW) ��ȭ�� �Է����ּ���.(��, 1�� �̻�) () > ");
		
		int won = sc.nextInt();
		double dollar = (won * 0.00089);
		
		System.out.println(won + "���� $" + Math.round(dollar * 1000) / 100.0 + "�Դϴ�.(ȯ�� ������ 1.76%)");
		System.out.println("ȯ�� �� ����ݾ� : $ "  -(Math.round(dollar * 1000) / 100.0) * 0.9825);

				 */

	}

}
