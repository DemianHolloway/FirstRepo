package myobj.item;

public class Bread extends Item{
	
	
	int healthy;
	
	public Bread(String name, int price) {
		super(name, price);
		healthy = 75;

	}
	
	public void use() {
		System.out.println("���� �Ծ" + healthy + "��ŭ �������� ä�����ϴ�.");
	}
	
	public static void main(String[] args) {
		new Bread("�佺��", 2500).info();
	}
}