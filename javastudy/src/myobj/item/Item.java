package myobj.item;

abstract public class Item {

/*
 	�� Ŭ������ ��ӹ޾� �������� 3�� �������� (* Item Ŭ������ �������� �� ��)
 */
	String name;
	int price;

	
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	// final�� ���� �޼���� �ڽ� Ŭ�������� �������̵带 ������Ų��
	final public void info() {
		System.out.printf("�̸�" + name);
		System.out.printf("����" + price + "��");
	}
	
	
	abstract public void use(); {
//		System.out.printf("���� ������ �ڽ� Ŭ�������� �������̵�� ����");

	}

}