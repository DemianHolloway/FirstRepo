package quiz;

public class B16_TempPassword2 {

	public static void main(String[] args) {

		 /*
        4�ڸ��� ���� �ӽú�й�ȣ�� �����ϴ� ���α׷��� ��������.
        (��й�ȣ�� �����ϴ� ���ڴ� ���� �빮�ڿ� �����Դϴ�)         
		  */

        
        // ���ڼ��� �����ΰ� �ε����� �������� �����ϴ� ���
        String charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        
        int password_size = 4;
        
        for (int i = 0; i < password_size; ++i) {
                int random_index = (int)(Math.random() * charset.length());
                System.out.print(charset.charAt(random_index));
        }
        System.out.println();
}

}