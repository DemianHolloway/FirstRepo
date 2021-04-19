package quiz;

public class B17_countAlphabet {

	public static void main(String[] args) {
		/*
		 	사용자로부터 문장을 하나 입력받고
		 	해당 문장에 어떤 알파벳이 몇 번 등장했는지 세어서 모두 출력해보세요
		 	(대소문자 구분없이 셀 것)
		 	
		 */
		
		
		String text = "Everything is alight";
		
		// # 문자열을 쉽게 대문자 또는 소문자로 변환하기
		text = text.toUpperCase();
		
		int[] count = new int[26];
		
		for (int i = 0; i < text.length(); ++i) {
			
			char ch = text.charAt(i);
			
			System.out.println(ch);
			
			if (ch >= 'A' && ch <= 'Z') {
				count[ch - 'A']++; // 26개의 방 번호를 부여받는 과정
			
			}
		
		}
	}
}
		
/* 내가한 얼레벌레
		Scanner sc = new Scanner(System.in);
		
		String user_input;

		System.out.print("문장을 입력하세요 >> ");
		
		user_input = sc.next();
		
		char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T',
				'U','V','W', 'X', 'Y', 'Z','a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
				'm', 'n', 'o', 'p', 'q', 'r','s', 't', 'u','v', 'w', 'x', 'y', 'z'};
		
		String text
	
			for (user_input; i < alphabet.length; ++i) {
			}
				System.out.println(alphabet[i]);
		
		System.out.println("-----------------------------");
		System.out.printf("[%d]: [%s]회", alphabet[i]); //어떤 알파벳이 몇 번 등장
			}
		}
	}
*/