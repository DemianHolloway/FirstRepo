package myobj.item;

public class Medicine extends Item{

		
	int healthy;
		
	public Medicine(String name, int price) {
		super(name, price);
		healthy = 199;

	}
		
	public void use() {
		System.out.println("���� �Ծ" + healthy + "��ŭ ����� ä�����ϴ�.");
	}
		
	public static void main(String[] args) {
		new Medicine("��ȭ��", 4200).info();
	}
}