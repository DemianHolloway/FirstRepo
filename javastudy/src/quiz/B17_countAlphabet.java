package quiz;

public class B17_countAlphabet {

	public static void main(String[] args) {
		/*
		 	����ڷκ��� ������ �ϳ� �Է¹ް�
		 	�ش� ���忡 � ���ĺ��� �� �� �����ߴ��� ��� ��� ����غ�����
		 	(��ҹ��� ���о��� �� ��)
		 	
		 */
		
		
		String text = "Everything is alight";
		
		// # ���ڿ��� ���� �빮�� �Ǵ� �ҹ��ڷ� ��ȯ�ϱ�
		text = text.toUpperCase();
		
		int[] count = new int[26];
		
		for (int i = 0; i < text.length(); ++i) {
			
			char ch = text.charAt(i);
			
			System.out.println(ch);
			
			if (ch >= 'A' && ch <= 'Z') {
				count[ch - 'A']++; // 26���� �� ��ȣ�� �ο��޴� ����
			
			}
		
		}
	}
}
		
/* ������ �󷹹���
		Scanner sc = new Scanner(System.in);
		
		String user_input;

		System.out.print("������ �Է��ϼ��� >> ");
		
		user_input = sc.next();
		
		char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T',
				'U','V','W', 'X', 'Y', 'Z','a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
				'm', 'n', 'o', 'p', 'q', 'r','s', 't', 'u','v', 'w', 'x', 'y', 'z'};
		
		String text
	
			for (user_input; i < alphabet.length; ++i) {
			}
				System.out.println(alphabet[i]);
		
		System.out.println("-----------------------------");
		System.out.printf("[%d]: [%s]ȸ", alphabet[i]); //� ���ĺ��� �� �� ����
			}
		}
	}
*/