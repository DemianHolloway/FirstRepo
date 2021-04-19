package myobj.item;

public class Medicine extends Item{

		
	int healthy;
		
	public Medicine(String name, int price) {
		super(name, price);
		healthy = 199;

	}
		
	public void use() {
		System.out.println("약을 먹어서" + healthy + "만큼 기력이 채워집니다.");
	}
		
	public static void main(String[] args) {
		new Medicine("쌍화탕", 4200).info();
	}
}