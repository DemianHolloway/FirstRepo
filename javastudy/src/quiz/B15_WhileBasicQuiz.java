package quiz;

public class B15_WhileBasicQuiz {

	public static void main(String[] args) {
		
		/*
		 
		 	While���� �̿��Ͽ�
		 	
		 	1. 1���� 100������ 3�� ����� ����
		 	
		 	2. 200���� 1���� ���
		 	
		 	3. continuue�� �̿��Ͽ� 7�� ����� ���
		 	
		 	4. 1���� 200������ ���� �� 2�� ����� �ƴϰ� 3�� ����� �ƴ�
		 
		 */
		// 1�� ����
		int i = 0;
		int sum = 0;
		
		while (i++ < 100) {
			if(i % 3 == 0) {
				sum += i;
			}
		}
			
			System.out.println(sum);
	
	// 2������		
	i = 200;
	
	while (i > 0) {
		System.out.println(i--);
	
	}
	
	//3�� ����

	i = 300;
	
	while (i <= 500) {
		
		 if (i % 7 != 0) {
			 continue;
		 }
	}
		 System.out.println(i);
	
	
	//4������
	
	i = 0;
	sum = 0;
	
	while (i++ < 200) {
		 if (i % 2 != 0 && i % 3 != 0) {
			 sum += i;
		 }
		}
	
		 System.out.println("4�� ��: " + sum);
	}
}