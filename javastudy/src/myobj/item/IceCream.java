package myobj.item;

public class IceCream extends Item{

	
	int healthy;
		
	public IceCream(String name, int price) {
		super(name, price);
		healthy = 15;
		
	}

	public void use() {
		System.out.println("아이스크림을 먹어서" + healthy + "만큼 더위 내성이 좋아졌습니다.");
	}
		
	public static void main(String[] args) {
		new IceCream("딸기파르페", 1500).info();
	}
}
