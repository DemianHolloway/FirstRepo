
public class C05_Inheritance {

	/*
	 	# 클래스 상속
	 	
	 	- 이미 존재하는 클래스를 그대로 물려받거나 고쳐서 사용하는 것
	 	- 상속해주는 클래스를 부모 클래스 또는 슈퍼 클래스라고 한다
	 	- 상속받는 클래스를 자식 클래스 또는 서브 클래스라고 한다
	 */
	
	
	public static void main(String[] args) {
		Person[] persons = new Person[3];
		
		persons[0] = new Person("홍길동", 10, 10);
		persons[1] = new Person("고길동", 45, 15);
		persons[2] = new Person("이길동", 10, 10);
		
		persons[0] .sayHi();
		persons[1] .sayHi();
		persons[2] .sayHi();
		
		
		// 부모 클래스에서 만들었던 기능을 자유롭게 사용할 수 있다
		Police policel  = new Police();
		
		policel.sayHi();
		policel.walk();
		policel.run();
		
		policel.thisSuperTest("둘리");
	}

}

class Person {

	String name;
	int age;
	int speed;
	
	public Person(String name, int age, int speed) {
		this.name = name;
		this.age = age;
		this.speed = speed;
	}
	
	void sayHi() {
		//연습문제: 나이가 많을수록 공손하게 인사하도록 만들어보세요
		if (age < 0) {
			System.out.println("?");
			
		} else if (age < 10) {
			
		System.out.printf("안녕! 내 이름은 %s야. 나이는 %d살 이야.\n", name, age);
		
		}else if (age < 20) {
			
		System.out.printf("안녕하세요, 제 이름은 %s. %d살 입니다.\n", name, age);
		
		} else if (age < 30) {
			
		System.out.printf("안녕하십니까, 제 이름은 %s입니다. 나이는 %d살 입니다.\n", name, age);
		
		}
	}
	
	
	void walk() {
	System.out.printf("%s씨는 %d미터 걸었습니다.", name, speed / 2);
	
	}
	
	void run() {
		System.out.printf("%s씨는 %d미터 뛰었습니다.", name, speed);
	}

}
/*
 	1. 상속받는 클래스는 생성자에서 가장 먼저 부모의 생성자를 호출해야 한다.
 	   부모 클래스에 기본생성자가 존재하면 생략할 수 있지만,
 	   존재하지 않을때는 생략이 불가능하다
 	   
 	   2. 자식 클래스는 부모의 메서드를 마음대로 고쳐서 사용할 수 있다 (오버라이드, Overeide)
 	   
 	   3. 부모 클래스와 자식 클래스에 똑같은 이름을 가진 자원이 있을 경우
 	   super와 this로 정확하게 구분할 수 있다
 */

class Police extends Person {
	
	String name = "마동석";
	
	// 자식 클래스의 생성자에서는 첫 줄에 super()를 반드시 호출해야 한다. (피룻)
	public Police(){
		super("김경찰", 23, 20);
		// super(): 부모 클래스의 생성자를 호출할 때 사용한다.
	}
	
	@Override
	void sayHi() {
		System.out.printf("안녕하십니까, 저는 %s 형사 입니다.\n", name);
	}
	
	void thisSuperTest(String name) {
		
		System.out.println("그냥 name : " + name);
		System.out.println("this name : " + this.name);
		System.out.println("super.name : " + super.name);
	}

	void arrest(String suspect) {
	
	System.out.printf("%s 형사는 용의자 %s씨를 체포했습니다.", name, suspect);
	}
}

//class Programmer extends Person {
	
	// 자식 클래스에서 생성자를 정의하지 않을 시 눈에는 안보이지만
	// 자식 클래스에도 기본 생성자가 생기고 부모 클래스의 기본 생성자를 사용한다
//}