package quiz;

import java.util.Random;
import java.util.Scanner;

public class B16_31Game {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
         
         final int PLAYER = 0, COMPUTER = 1;
         
         int num = 0;
         int turn = 0;
         
         while (true) {
                 
                 if (turn == PLAYER) {
                         
                         int user = -1;
                         
                         while (true) {
                                 System.out.print("����� �� > ");
                                 user = sc.nextInt();
                                 
                                 if (user > 0 && user <= 3) {
                                         break;
                                 } else {
                                         System.out.println("�߸��� ���Դϴ�. [1, 2, 3] �߿� �������ּ���");
                                 }        
                         }
                         
                         num += user;
                         
                         System.out.printf("����� %d�� ���� [%d]\n", user, num);
                         turn = COMPUTER;                                
                 } else if (turn == COMPUTER) {
                   int com;
                   
                   if (num % 4 == 0) {
                	   com = 2;
                   } else if (num % 4 == 1) {
                	   com = 1;
                	   
                   } else if (num % 4 == 2) {
                	   com = (int)(Math.random() * 3 + 1);
                   } else {
                	   com = 3;
                   }
                   
                   num += com;
                   System.out.println("��ǻ���� ���� > " + com);
                   System.out.printf("��ǻ�Ͱ� %d�� ���� [%d]\n", com, num);
                   turn = PLAYER;
                 }
                 
                 if (num >= 31) {
                         String winner = turn == PLAYER ? "�÷��̾�" : "��ǻ��"; 
                         System.out.printf("<< '%s'�� �¸� >>\n", winner);
                         break;
                 }
         }
         
         System.out.println("������ �������ϴ�!");
         
 }
 
		
		
		
	}
		/*
		 Scanner sc = new Scanner(System.in);
         
         final int PLAYER = 0, COMPUTER = 1;
         
         int num = 0;
         int turn = 0;
         
         while (true) {
                 
                 if (turn == PLAYER) {
                         
                         int user = -1;
                         
                         while (true) {
                                 System.out.print("����� �� > ");
                                 user = sc.nextInt();
                                 
                                 if (user > 0 && user <= 3) {
                                         break;
                                 } else {
                                         System.out.println("�߸��� ���Դϴ�. [1, 2, 3] �߿� �������ּ���");
                                 }        
                         }
                         
                         num += user;
                         
                         System.out.printf("����� %d�� ���� [%d]\n", user, num);
                         turn = COMPUTER;                                
                 } else if (turn == COMPUTER) {
                         int com = (int)(Math.random() * 3 + 1); 
                         num += com;
                         System.out.println("��ǻ���� ���� > " + com);
                         
                         System.out.printf("��ǻ�Ͱ� %d�� ���� [%d]\n", com, num);
                         turn = PLAYER;
                 }
                 
                 if (num >= 31) {
                         String winner = turn == PLAYER ? "�÷��̾�" : "��ǻ��"; 
                         System.out.printf("<< '%s'�� �¸� >>\n", winner);
                         break;
                 }
         }
         
         System.out.println("������ �������ϴ�!");
         
 }
 
}
*/


		/*
		 
		 31������ ����� ������
		 
		 1. ��ǻ�Ϳ� ����� �����ư��鼭 ���ڸ� �����ؾ� �Ѵ�.
		 	(1,2, 3�ۿ� ������ �� ����)
		 2. ��ǻ�ʹ� �������� ���ڸ� �����ϴ�
		 3. ������ �������� �����Ѵ�
		 4. �������� 31 �̻��� ���ڸ� ���� �÷��̾ �й��Ѵ�
		 */
		
		/*
		 ���� �� �󷹹���..
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Է��ϼ��� >");
		
		int num = sc.nextInt();
		int turn = 0;
		
		while (num < 31) {
			
			if (turn == 0) {
				num += 0;  //<���⿡ �Է°� ���� ����־�??
				System.out.println("��� [" + num + "]");
				turn = 1;
			} else {
				num += (int)(Math.random() * 3 + 1);
				System.out.print("��ǻ��  [" + num + "]");
				turn = 0;
			}
		}
		*/

		
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 , 2, 3 �� ���ڸ� �Է��ϼ��� >> ");
			
		int input = sc.nextInt();
		int cnt = 0;
			
			for (int i = 1; i <= input; ++i) {
				String count = "" + i;
				
		int ran = 0;
		
				if(int ran = new Random()) {
		
				System.out.println(ran.nextInt(3) + 1);
				
				if(R= new Random()) {
				}
			}
	}
	*/
