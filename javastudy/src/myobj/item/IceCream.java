package myobj.item;

public class IceCream extends Item{

	
	int healthy;
		
	public IceCream(String name, int price) {
		super(name, price);
		healthy = 15;
		
	}

	public void use() {
		System.out.println("���̽�ũ���� �Ծ" + healthy + "��ŭ ���� ������ ���������ϴ�.");
	}
		
	public static void main(String[] args) {
		new IceCream("�����ĸ���", 1500).info();
	}
}
