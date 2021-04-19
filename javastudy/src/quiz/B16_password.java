package quiz;

public class B16_password {

	public static void main(String[] args) {
		/*
		 4자리의 랜덤 임시비밀번호를 생성하는 프로그램을 만들어보세요.
		(비밀번호를 구성하는 문자는 영어 대문자와 숫자입니다)
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
        
        System.out.println("임시 비밀번호: " + tempPassword.toString());
	}
	
		/*
		내가 한 얼레벌레...
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

