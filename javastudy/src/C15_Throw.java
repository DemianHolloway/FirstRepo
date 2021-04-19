
public class C15_Throw {

	/*
	 	# Throw
	 	
	 	- ���ϴ� ���ܸ� �߻���Ų��
	 	
	 	# Throws
	 	
	 	- �ش��ϴ� �޼��忡�� �̷��� ���ܵ��� �߻���Ų�ٴ� ���� �˸���
	 	- �ش� �޼��带 ȣ���ϴ� ���� ��� ���� �� �ִ�
	 	- ���ܿ� ���� ó���� ȣ���ϴ� ������ �̷��
	 	
	 	# Exception Ŭ������ ��ӹ��� ���ܴ� "�� ó���ؾ� �ϴ� ����"�� �ȴ�.
	 	
	 	  - Exception�� ����ó���� ���� ������ ������ ������ �߻���Ų��
	 	  - ����ó���� �� ��쿡�� �������� ������ش�
	 	
	 	# RuntomeException Ŭ������ ��ӹ��� ���ܴ� "�� ó������ �ʾƵ� �Ǵ� ����"�� �ȴ�
	 		- InputMismatchException,ArrayIndexOutOdBoundException ...��
	 		- ���� ó���� ���� �ʾƵ� ������ ������ �߻����� �ʴ� ���ܵ�
	 */
	public static void main(String[] args) {	
		C15_Throw instance = new C15_Throw();
	
		try {
			instance.dangerous_method();
			instance.dangerous_method2();
		} catch (FileNotFoundException e) {
			System.out.println("���� �� ã��");
		} catch (ArrayIndexOutOfBoundsExceptionn e) {
			System.out.println("�迭 ����" + e.getMessage());
		}
		
		try {
			instance.checkEven(20);
			instance.checkOdd(14);
		} catch (NotEvenExeception e) {
			System.out.println("¦�� �ƴ� �ͼ��� �߻�");		
		} catch (NotOddException e) {
			System.out.println("Ȧ�� �ƴ� �ͼ��� �߻�");	
		}
		
		System.out.println("���α׷� ���� ����");
	}
	
	public void dangerous_method() throws FileNotFoundException {
		// ������ ������ �о���� ���� �غ� ���� (�� ó������ �ϴ� ���ܰ� �߻�)
		File f = new File("D:\\nameless.txt");
		FileReader reader = new FileReader(f);
	}
	
	public void dangerous_method2() {
		throw new ArrayIndexOutOfBoundsException("�׳� �������");
	}
	
	public void checkEven(int num) throws NotEvenExeception {
		if (num % 2 == 0) {
			System.out.println("¦���Դϴ�");
		} else {
			throw new NotEvenExeception();
		}
	
		System.out.println("checkEven �޼��尡 ���� ���� �Ǿ����ϴ�.");
		
	}
	
	public void checkOdd(int num) {
		if (num % 2 == 1) {
			System.out.println("Ȧ���Դϴ�");
		} else {
			throw new NotOddExeception();
		}	
			System.out.println("checkOdd �޼��尡 ���� ���� �Ǿ����ϴ�.");
	}
}

// ¦���� �ƴҶ� �߻���ų ���� (����ó�� ���� ������ ������ �Ұ�)
class NotEvenExeception extends Exception {
	public NotEvenExeception() {
		super("¦���� �ƴϾ �߻��ϴ� ����");
	}
}

// Ȧ���� �ƴ� �� �߻���ų ���� (����ó�� ���� �ʾƵ� �������� ���� �ʴ� ����)
class NotOddException extends RuntimeException {
	public NotOddException() {
		super("Ȧ���� �ƴϾ �߻��ϴ� ����");
	}

}
