package myobj.item;

public class Bread extends Item{
	
	
	int healthy;
	
	public Bread(String name, int price) {
		super(name, price);
		healthy = 75;

	}
	
	public void use() {
		System.out.println("빵을 먹어서" + healthy + "만큼 공복감이 채워집니다.");
	}
	
	public static void main(String[] args) {
		new Bread("페스츄리", 2500).info();
	}
}