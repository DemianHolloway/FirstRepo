package quiz;

public class B16_password {

	public static void main(String[] args) {
		/*
		 4�ڸ��� ���� �ӽú�й�ȣ�� �����ϴ� ���α׷��� ��������.
		(��й�ȣ�� �����ϴ� ���ڴ� ���� �빮�ڿ� �����Դϴ�)
		 */
		
		StringBuilder tempPassword = new StringBuilder();
        int size = 4;
        
        for (int i = 0; i < size; ++i) {                        
                switch ((int)(Math.random() * 2)) {
                case 0:
                        tempPassword.append((char)(Math.random() * 26 + 'A'));
                        break;
                case 1:
                        tempPassword.append((char)(Math.random() * 10 + '0'));
                        break;                                
                }
        }
        
        System.out.println("�ӽ� ��й�ȣ: " + tempPassword.toString());
	}
	
		/*
		���� �� �󷹹���...
		for (int i = 0; i < 4; ++i) {
			
			int ch =  Math.abs(i);
			while (ch > 0) {
				int alpha = ch;
				int num = i;
				
				if(alpha || num ) {
					
				}
			System.out.println((int)(Math.random() * 9 + 0));
			System.out.println((char)(Math.random() * (char)90 + (char)65));
			*/
		
		
		
	}

