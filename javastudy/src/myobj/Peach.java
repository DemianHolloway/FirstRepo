package myobj;

import myobj.item.*;

public class Peach {
	

	int size;
	int calorie;
	long lifetime;
	double sweet;
	String color;
	
	// 다른 패키지에서 가져다 쓰고 싶을때는 public을 붙여야 한다
	void eat() {
		size--;
		calorie -= 10;
	}
	public static void main(String[] args) {
		
		Inventory inven1 = new Inventory(5);
		
	}
}
