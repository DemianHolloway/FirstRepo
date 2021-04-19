import myobj.Communication;
import myobj.Peach;

public class C02_00P {

		/*
		 	# ��ü���� ���α׷��� (OOP: Object Oriented Programing)
		 	
		 	- ���� �����ϴ� ��� �͵��� ����ȭ �Լ��� ǥ���Ϸ��� ���α׷��� �����
		 	- ������ �Լ��� ���к��ϰ� ����ϱ� ���ٴ�
		 	  ���ǿ� �����ϴ� ��ü ������ ��� ǥ���Ͽ� �������� �ø���
		 	- ��ü (Objact) : ���� �����ϴ� ��� ���� ���Ѵ� (�繰, ����, ... ���)
		 	
		 	ex: ���
		 	- ����� ���� ũ��, ����, �絵, ...
		 	- ����� �޼���
		 		-> ������ (ũ�� ��ŭ�� �������� ������)
		 		-> �Դ´� (���� ��ŭ Į�θ��� �پ��� ����� ũ�Ⱑ �پ���)
		 		-> �����Ѵ� (����� �����ϸ� ��������� ������ �����Ѵ�)
		 
		 	* Ŭ���� ���ο� �ִ� �Լ��� �޼����� �θ��� (��� JAVA���� �޼��� �ۿ� ����)
		 
		 
		 	# Ŭ���� (Class)
		 	
		 	- ��ü�� ���α׷��� ���� ǥ���� ��
		 	- Ŭ������ ��ü�� ���赵�̴�
		 	- Ŭ������ ���� �����ϴ� ���� ��ü�� '�ν��Ͻ�'��� �θ���
		 */
	
		 // ���α׷� ���� �ÿ� public class�� �ִ� main�� ã�� �� �ִ�
		 public static void main(String[] args) {
			 
			 //Apple Ŭ����(���赵)�� ���� �ν��Ͻ�(����ǰ) a1
			 Apple a1 = new Apple();
			 Apple a2 = new Apple();
			 Apple a3 = new Apple();
			 
			 //�ٸ� ��Ű���� ������ public class�� ����� �� �ִ�
			 myobj.Peach p1 = new myobj.Peach();
			 Peach p2 = new Peach();
			 
			 a1.calorie = 100;
			 a2.calorie = 120;
			 a3.calorie = 115;
			 
			 a1.eat();
			 a1.eat();
			 
			 System.out.println(a1.calorie);
			 System.out.println(a2.calorie);
			 System.out.println(a3.calorie);
			 
			 
			 String str1 = "abc";
			 String str2 = "cc";
			 String str3 = "bb";
			 
			 /*
			  	myobj ��Ű���� ������ ��ü�� �����Ͽ� Ŭ������ �ϳ� ������ ��
			  	�ν��Ͻ��� �����ϰ� ���� ä����� ����غ�����
			  	
			  	* �ν��Ͻ� ���� 3�� �̻�, �ν��Ͻ� �޼��� 2�� �̻�, ���� ����
			  */
			 Communication c1 = new Communication();
			 Communication c2 = new Communication();
			 Communication c3 = new Communication();
			 
			 Communication f1 = new myobj.Communication();
			 Communication f2 = new Communication();
			 
			 c1.listne = 90;
			 c2.listne = 200;
			 c3.listne = 135;
			 
			 
			 c1.listning();
			 c1.listning();
			 
			 
			 c1.action = 50;
			 c2.action = 74;
			 c3.action = 28;
			 
			 c1.feeling();
			 c1.feeling();
			 
			 System.out.println(c1.listne);
			 System.out.println(c2.listne);
			 System.out.println(c3.listne);
			 System.out.println("----------");
			 System.out.println(c1.action);
			 System.out.println(c2.action);
			 System.out.println(c3.action);
			 
	}
}

// default class (public�� �� ���� clss)
class Apple {
	
	/*
	 	# �ν��Ͻ� ����
	 	 - �� �ν��Ͻ����� �ٸ� ���� ���� �� �ִ� ����
	 	 - aka �ʵ�, �Ӽ�, ��� ����, ����, ... (�� ���� ��)
	 */
	int size;
	int calorie;
	long lifetime;
	double sweet;
	String color;
	
	/*
	 
	 	# �ν��Ͻ� �޼���
	 	- �ν��Ͻ� ������ Ȱ���Ͽ� �ش� �ν��Ͻ��� ���¸� ��ȭ��Ű�� �޼���
	 */
	
	void eat() {
		size--;
		calorie -= 10;
	}
}
