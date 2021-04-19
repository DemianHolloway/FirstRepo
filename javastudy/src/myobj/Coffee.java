package myobj;

public class Coffee {
	
	
	private static class CoffeeCode {
		int code;
		String name;
		
		private CoffeeCode(int code, String name) {
			this.code = code;
			this.name = name;
		}
		
		public CoffeeCode(int code, String name) {
			this.code = code;
			this.name = name;
		}
	}

//	private static String[] coffee_names = {"아메리카노","카페라떼","카페모카","캬라멜 마끼아또"};
//	private static String[] origin_names = {"콜롬비아","브라질","에티오피아","케냐","인도"};
	
	public static CoffeeCode AMERICANO = new CoffeeCode(0,"아메리카노");
	public static CoffeeCode CAFE_LATHE = new CoffeeCode(1,"카페라떼");
	public static CoffeeCode CAFE_MOCHA = new CoffeeCode(2,"카페모카");
	public static CoffeeCode CHARAMEL_MACCHIATO = new CoffeeCode(3,"캬라멜 마끼아토");
	
	
	CoffeeCode coffee;
	int price;
	int caffeine;
	int origin;
	
	boolean hot;
	
	public Coffee(CoffeeCode coffee, int price, int caffein, int origin) {
		this.coffee = coffee;
		this.price = price;
		this.caffeine = caffein;
		this.origin = origin;
		this.hot = true;
		
	}
	
	public String getCoffeeName() {
		return coffee.name;
	}
	
	public int getCoffeeCode() {
		return coffee.code;
	}
	public String getOriginName() {
		return null;
	}
	
	public static void main(String[] args) {
		Coffee coffee = new Coffee(Coffee.AMERICANO, 1500, 10, 4);
		Coffee coffee1 = new Coffee(Coffee.CAFE_LATHE, 18500, 15, 4);
		Coffee coffee2 = new Coffee(Coffee.CAFE_MOCHA, 2500, 20, 4);
		Coffee coffee3 = new Coffee(Coffee.CHARAMEL_MACCHIATO, 3500, 25, 4);
	}
}
