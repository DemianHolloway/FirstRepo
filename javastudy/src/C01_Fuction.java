
public class C01_Fuction {

	public static void main(String[] args) {
		/*
		 	�Լ� (Function)
		 	
		 	- ����� �̸� �����صΰ� ���߿� ������ ���� ��
		 	- �����ص� �Լ� �̸� �ھ� ()�� �ٿ��� �Լ��� ȣ���ϸ�
		 	  ȣ���� �ڸ��� �Լ��� ���� ����� ��ȯ�ȴ�
		 	- �Լ��� ������ �� �ش� �Լ��� ��ȯ�� ���� Ÿ���� �տ� ����д�
		 	- �ڹٿ��� �Լ� (�޼���)�� �ݵ�� Ŭ���� ���ο� �����ؾ� �Ѵ�
		 	- ���߿� ���� �� ���ɼ��� �ִ� ��ɵ��� �̸� ���������ν� �۾��� �ݺ��� ���� �� �ִ�
		 	- ���� Ÿ�� void�� �ش� �Լ��� ��ȯ�ϴ� ���� ���ٴ� ���� ��Ÿ����
		 */
		
		
		for (int i = 0; i < 10; ++i) {
		print_rabbit();
		print_rabbit();
		print_rabbit();
		}
	
		//int basket = apple_basket(123, 10);
		//System.out.println("�ʿ��� �ٱ����� ������ " + basket);
		
		System.out.println(apple_basket(155, 10));
	
	}
	
	// ex : ����� ������ �ٱ����� ũ�⸦ �����ϸ� �ʿ��� �ٱ����� ������ �˷��ִ� �Լ�
	
	/*
	 	public static : ���߿� ������ ��
	 	int : �� �Լ��� ���� ����� Ÿ�� (���� Ÿ��, return type)
	 	apple_basket : Ÿ�� �ڿ� �Լ����� ������ �� �ִ�
	 	apple_basket(int apple, int size) : �� �Լ��� ������ �� intŸ�� ���� �� �� ���� �޾ƾ� �Ѵ� (�Ű�����, argument)
	 	
	*/
		public static String apple_basket(int apple, int size) {
			int result;
	
			if(apple % size == 0 ) {
				result = apple / size;
			} else {
				result = apple / size + 1;
			}
		
			return "�ʿ��� �ٱ����� ������ " + result + "�� �Դϴ�.";
	
		
		}
		
	
		public static void print_rabbit() {
			
			System.out.println(" /)/)");
			System.out.println("(  ..)");
			System.out.println("(   >$");
		}
		
	}

