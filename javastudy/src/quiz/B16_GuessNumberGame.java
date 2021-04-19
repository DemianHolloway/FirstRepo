package quiz;

import java.util.Scanner;

public class B16_GuessNumberGame {

	public static void main(String[] args) {
		/*
		 	������ ���۵Ǹ� �������� 4�ڸ��� ���ڰ� �����ȴ�
		 	
		 	1. �÷��̾�� 8���� �õ��� �� �� �ִ�
		 	
		 	2. �� �õ����� 4�ڸ��� ���ڸ� �Է��ϸ� ������ ���� �˷��ش�
		 	
		 		���ڿ� ��ġ�� �� ������� - Strike
		 		���ڸ� ������� - Ball
		 		
		 		ex : ������ 3456�϶�
		 		
		 		>> 5634 4 ball
		 		>> 3789 1 Strike
		 		>> 3654 1 Strike 3 ball
		 		
		 		* ���߰� ���� �� ������ ������� �˷��ֱ�
		 		
		 */
		final boolean DEBUGMODE = true;
        
        StringBuilder answer_builer = new StringBuilder();
        Scanner input_scanner = new Scanner(System.in);
        
        for (int i = 0; i < 4; ++i) {
                answer_builer.append((int)(Math.random() * 10));                        
        }                
        String answer = answer_builer.toString();
        
        if (DEBUGMODE) {
                System.out.printf("�̹� ���� [%s]\n", answer);
        }
        
        // �⺻ Ÿ�� ������ 0���� �ʱ�ȭ
        int strike = 0, ball = 0;
        int tryCount = 0;
        
        // ������ ������ null�� �ʱ�ȭ
        String input = null;
        
        while (strike != 4 && tryCount != 8) {
                strike = 0;
                ball = 0;
                
                while (true) {
                        System.out.printf("�õ� %d >> ", tryCount + 1);
                        input = input_scanner.nextLine();
                        
                        boolean valid = true;
                        
                        if (input.length() != 4) {
                                valid = false;
                        }                                
                        
                        for (int i = 0; valid && i < 4; ++i) {
                                if (input.charAt(i) < '0' || input.charAt(i) > '9') {
                                        valid = false;
                                }
                        }
                        
                        if (valid) {
                                break;
                        } else {
                                System.out.println("4�ڸ� ���ڸ� �Է��ϼž� �մϴ�.");
                        }
                } 
                
                // strike, ball üũ
                if (answer.equals(input)) {
                        strike = 4;
                } else {
                        for (int i = 0; i < 4; ++i) {                                        
                                
                                for (int j = 0; j < 4; ++j) {                                                
                                        if (answer.charAt(i) == input.charAt(j)) {                                                        
                                                if (i == j) {
                                                        strike++;
                                                } else {
                                                        ball++;
                                                }
                                                break;
                                        }                                                
                                }                                        
                        }
                }
                
                System.out.printf("%d strike, %d ball!\n", strike, ball);
                
                tryCount++;
        }
        
        System.out.println("���� ����!");
}


}

		
		/* ���� �� �󷹹���...

		Scanner sc = new Scanner(System.in);
		
		System.out.print("4�ڸ��� ���ڸ� �Է��ϼ��� >> ");
		int input = sc.nextInt();
		int cnt = 0;
		int right_num = 3456;
		
		for (int i = 1; i <= input; ++i) {
			String num_str = "" + i;
		
		for (int j = 0; j <= num_str.length(); ++j) {
			char num_ch = num_str.charAt(j);
			
			if(num_ch == '3' && num_ch == '4' && num_ch == '5' && num_ch == '6') {
				cnt++;
				System.out.print("4 Strike");
				
			if(num_ch == '3' || num_ch == '4' || num_ch == '5' || num_ch == '6') {
				cnt++;
					System.out.print("Strike");
					
			if(num_ch == '3' || num_ch == '4' || num_ch == '5' || num_ch == '6') {
				cnt++;
					System.out.print("Ball");
					
			if(num_ch != '3' && num_ch != '4' && num_ch != '5' && num_ch != '6') {
				cnt++;
					System.out.print("FAULT");
			}
			}
			}
			}
			}
		}
		System.out.println();

		System.out.println("\t �Է��� ���ڴ� [" + input + "] �Դϴ�."); 	// if�� �װ� ��� �ϴ°ǵ�
		System.out.println("------------------------------");	//�ƴ� cnt�� if�� ���� �Ƴ�?? �� �ù�
		System.out.print("���� : " + right_num + "\t///��� : " + cnt); // 1 Strike 3 ball << �̰� ������
	}

}
*/
