
public class B07_charAt {

	public static void main(String[] args) {
		/*
			"���ڿ�". charAt(index);
			- �ش� ���ڿ��� ���ϴ� ���ڸ� charŸ������ ������ �Լ�
			
			"���ڿ�". length();
			-�Լ��� �����ϸ� �ش� ���ڿ��� ���̸� (int)Ÿ������ �˷��ش�
			-
		 */
		
		System.out.println("Hellow, everyone!!!");
		
		// ù��°�� ���ڴ� 0, �ι�°�� ���ڴ� 1�̴�!!!
		System.out.println("Hellow, everyone!!!".charAt(0));
		System.out.println("Hellow, everyone!!!".charAt(1));
		System.out.println("Hellow, everyone!!!".charAt(12));
		
		
		String str = "Hellow, everyone!!";
		
		System.out.println(str.charAt(7));
		System.out.println("str�� �� ����¥�� ���ڿ��ΰ���?" + str.length());
		System.out.println(str.charAt(18));
		
	}

}
