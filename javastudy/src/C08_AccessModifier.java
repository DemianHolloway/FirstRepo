import myobj.Coffee;

public class C08_AccessModifier {

	
		/*
		 	# ���� ������ (AccessModifier)
		 
		 	- �ٸ� Ŭ�������� �ش� Ŭ������ �ڿ��� ����Ϸ��� �� ��
		 	  ��� ���θ� �����Ѵ�
		 	  
		 	# ���� �����ڸ� ���� ������ �� �ִ� �Ÿ��� ����
		 	
		 	- ���� Ŭ���� ������ �ٸ� �ڿ� (���� ����� �Ÿ�)
		 	- ���� ��Ű�� ������ �ٸ� �ڿ�
		 	- �ٸ� ��Ű���� ������ ��ӹ��� �ڿ�
		 	- �ٸ� ��Ű���� �ڿ� (���� �� �Ÿ�)
		 	
		 	# ���� �������� ����
		 	
		 	-public
		 		�ٸ� ��Ű������ �����Ӱ� ������ �� �ִ� �ڿ��� �ȴ�.
		 		
		 	- defalut (�ƹ��͵� �� ��)
		 	
		 		���� ��Ű�� ���ο����� �����Ӱ� ������ �� �ְ� �ȴ�.
		 		�ٸ� ��Ű�������� ������ �� ����.
		 		
		 	-protected
		 		�տ� protected�� ���� �ڿ���
		 		���� ��Ű�� ���ο����� �����Ӱ� ������ �� �ְ�,
		 		�ٸ� äŰ�������� ��ӹ��� Ŭ������ ������ �� �ִ� �ڿ��� �ȴ�.
		 		
		 	-private
		 		�տ� private�� ���� �ڿ��� ���� Ŭ���� ���ο����� ������ �� �ְ� �ȴ�
		 	
		 	
		 */
	public static void main(String[] args) {
		C08_SmaePackage instance = new C08_SamePackage();
		
		instance.protected_method();
		instance.default_method();
		instance.public_method();
		
		DiffPAckage instance2 = new DiffPackage();
		
		instance2.public_method();
		

		Coffee coffee = new Coffee(Coffee.AMERICANO, 1500, 10, 4);
		Coffee coffee1 = new Coffee(Coffee.CAFE_LATHE, 18500, 15, 4);
		Coffee coffee2 = new Coffee(Coffee.CAFE_MOCHA, 2500, 20, 4);
		Coffee coffee3 = new Coffee(Coffee.CHARAMEL_MACCHIATO, 3500, 25, 4);
		
		System.out.println();
	}
	
	
}


class Snack {
	private int size = 10;
	private void eat() {
		System.out.println(size - 1);

	}
}

class HoneyButterChip extends Snack {
	
	private void abc( ) {
		Snack s = new
		System.out.println(s.size);
	}
}

class Choco {
	
	void abs() {
		Snak s = new Snack();
		s.size;
	}
}