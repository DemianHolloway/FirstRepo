package quiz;


public class B11_is_numeric_str {

	public static void main(String[] args) {
		/*
		  �Է¹��� ���ڿ��� ���ڸ� ���ԵǾ� ������ result�� 1
		  �ٸ� ���ڰ� ���ԵǾ� �ִٸ� result�� 0
		 */
		
		String word = "123456789";
		String word2 = "1234a56";
		
		int numeric_str = 0;
		
		for (int i = 0; i < word.length(); ++i) {
			
			char ch = word.charAt(i);
			
			// 
			if (ch < '0' || ch > '9') {
				numeric_str = 0;
				break; // ���ڰ� �ƴ� �ٸ� ���ڸ� �ϳ���� ã���� �׸� ã��
			}
		}
		
		System.out.println("numeric_str: " + (numeric_str > 0 ? "true" : "false"));
		
		/*
		 ���� �� ��
		Scanner sc = new Scanner(System.in);

		system.out.print(" ���ڸ� �Է��ϼ���. >> ");
		
		for (int i = 10; i >= 0; i--) {

			boolean text = 
					
			if (sc.nextInt(); = ) {
				continue;
			}
			System.out.println("false");
		*/
	}

}
