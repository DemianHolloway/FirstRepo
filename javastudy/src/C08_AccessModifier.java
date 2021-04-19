import myobj.Coffee;

public class C08_AccessModifier {

	
		/*
		 	# 접근 제어자 (AccessModifier)
		 
		 	- 다른 클래스에서 해당 클래스의 자원을 사용하려고 할 때
		 	  허용 여부를 설정한다
		 	  
		 	# 접근 제어자를 통해 구분할 수 있는 거리의 종류
		 	
		 	- 같은 클래스 내부의 다른 자원 (가장 가까운 거리)
		 	- 같은 패키지 내부의 다른 자원
		 	- 다른 패키지에 있지만 상속받은 자원
		 	- 다른 패키지의 자원 (가장 먼 거리)
		 	
		 	# 접근 제어자의 종류
		 	
		 	-public
		 		다른 패키지에서 자유롭게 접근할 수 있는 자원이 된다.
		 		
		 	- defalut (아무것도 안 씀)
		 	
		 		같은 패키지 내부에서는 자유롭게 접근할 수 있게 된다.
		 		다른 패키지에서는 접근할 수 없다.
		 		
		 	-protected
		 		앞에 protected가 붙은 자원은
		 		같은 패키지 내부에서는 자유롭게 접근할 수 있고,
		 		다른 채키지에서는 상속받은 클래스만 접근할 수 있는 자원이 된다.
		 		
		 	-private
		 		앞에 private이 붙은 자원은 같은 클래스 내부에서만 접근할 수 있게 된다
		 	
		 	
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