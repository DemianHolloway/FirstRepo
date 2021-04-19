package quiz;

import java.util.Scanner;

public class B16_GuessNumberGame {

	public static void main(String[] args) {
		/*
		 	게임이 시작되면 랜덤으로 4자리의 숫자가 선정된다
		 	
		 	1. 플레이어는 8번의 시도를 할 수 있다
		 	
		 	2. 각 시도마다 4자리의 숫자를 입력하면 다음과 같이 알려준다
		 	
		 		숫자와 위치가 다 맞을경우 - Strike
		 		숫자만 맞을경우 - Ball
		 		
		 		ex : 정답이 3456일때
		 		
		 		>> 5634 4 ball
		 		>> 3789 1 Strike
		 		>> 3654 1 Strike 3 ball
		 		
		 		* 맞추고 나면 몇 번만에 맞췄는지 알려주기
		 		
		 */
		final boolean DEBUGMODE = true;
        
        StringBuilder answer_builer = new StringBuilder();
        Scanner input_scanner = new Scanner(System.in);
        
        for (int i = 0; i < 4; ++i) {
                answer_builer.append((int)(Math.random() * 10));                        
        }                
        String answer = answer_builer.toString();
        
        if (DEBUGMODE) {
                System.out.printf("이번 정답 [%s]\n", answer);
        }
        
        // 기본 타입 변수는 0으로 초기화
        int strike = 0, ball = 0;
        int tryCount = 0;
        
        // 참조형 변수는 null로 초기화
        String input = null;
        
        while (strike != 4 && tryCount != 8) {
                strike = 0;
                ball = 0;
                
                while (true) {
                        System.out.printf("시도 %d >> ", tryCount + 1);
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
                                System.out.println("4자리 숫자만 입력하셔야 합니다.");
                        }
                } 
                
                // strike, ball 체크
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
        
        System.out.println("게임 종료!");
}


}

		
		/* 내가 한 얼레벌레...

		Scanner sc = new Scanner(System.in);
		
		System.out.print("4자리의 숫자를 입력하세요 >> ");
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

		System.out.println("\t 입력한 숫자는 [" + input + "] 입니다."); 	// if문 그거 어떻게 하는건데
		System.out.println("------------------------------");	//아니 cnt가 if문 내용 아녀?? 이 시발
		System.out.print("정답 : " + right_num + "\t///결과 : " + cnt); // 1 Strike 3 ball << 이게 떠야함
	}

}
*/
