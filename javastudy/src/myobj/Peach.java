package myobj;

import myobj.item.*;

public class Peach {
	

	int size;
	int calorie;
	long lifetime;
	double sweet;
	String color;
	
	// �ٸ� ��Ű������ ������ ���� �������� public�� �ٿ��� �Ѵ�
	void eat() {
		size--;
		calorie -= 10;
	}
	public static void main(String[] args) {
		
		Inventory inven1 = new Inventory(5);
		
	}
}
