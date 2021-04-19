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
                                 System.out.print("당신의 턴 > ");
                                 user = sc.nextInt();
                                 
                                 if (user > 0 && user <= 3) {
                                         break;
                                 } else {
                                         System.out.println("잘못된 값입니다. [1, 2, 3] 중에 선택해주세요");
                                 }        
                         }
                         
                         num += user;
                         
                         System.out.printf("당신이 %d을 선택 [%d]\n", user, num);
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
                   System.out.println("컴퓨터의 선택 > " + com);
                   System.out.printf("컴퓨터가 %d을 선택 [%d]\n", com, num);
                   turn = PLAYER;
                 }
                 
                 if (num >= 31) {
                         String winner = turn == PLAYER ? "플레이어" : "컴퓨터"; 
                         System.out.printf("<< '%s'의 승리 >>\n", winner);
                         break;
                 }
         }
         
         System.out.println("게임이 끝났습니다!");
         
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
                                 System.out.print("당신의 턴 > ");
                                 user = sc.nextInt();
                                 
                                 if (user > 0 && user <= 3) {
                                         break;
                                 } else {
                                         System.out.println("잘못된 값입니다. [1, 2, 3] 중에 선택해주세요");
                                 }        
                         }
                         
                         num += user;
                         
                         System.out.printf("당신이 %d을 선택 [%d]\n", user, num);
                         turn = COMPUTER;                                
                 } else if (turn == COMPUTER) {
                         int com = (int)(Math.random() * 3 + 1); 
                         num += com;
                         System.out.println("컴퓨터의 선택 > " + com);
                         
                         System.out.printf("컴퓨터가 %d을 선택 [%d]\n", com, num);
                         turn = PLAYER;
                 }
                 
                 if (num >= 31) {
                         String winner = turn == PLAYER ? "플레이어" : "컴퓨터"; 
                         System.out.printf("<< '%s'의 승리 >>\n", winner);
                         break;
                 }
         }
         
         System.out.println("게임이 끝났습니다!");
         
 }
 
}
*/


		/*
		 
		 31게임을 만들어 보세요
		 
		 1. 컴퓨터와 사람이 번갈아가면서 숫자를 선택해야 한다.
		 	(1,2, 3밖에 선택할 수 없음)
		 2. 컴퓨터는 랜덤으로 숫자를 선택하다
		 3. 선공은 랜덤으로 결정한다
		 4. 마지막에 31 이상의 숫자를 만든 플레이어가 패배한다
		 */
		
		/*
		 내가 한 얼레벌레..
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수를 입력하세요 >");
		
		int num = sc.nextInt();
		int turn = 0;
		
		while (num < 31) {
			
			if (turn == 0) {
				num += 0;  //<여기에 입력값 어케 집어넣어??
				System.out.println("사람 [" + num + "]");
				turn = 1;
			} else {
				num += (int)(Math.random() * 3 + 1);
				System.out.print("컴퓨터  [" + num + "]");
				turn = 0;
			}
		}
		*/

		
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 , 2, 3 중 숫자를 입력하세요 >> ");
			
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
