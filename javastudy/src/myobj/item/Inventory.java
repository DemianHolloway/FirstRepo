package myobj.item;

public class Inventory {

	Item[] inventory;
	int size;
	
	public Inventory(int size) {
		inventory = new Item[size];
	}
	
	public boolean put(Item item) {
		for (int i = 0; i < inventory.length; ++i) {
		
			if (inventory[i] == null) {
				inventory[i] = item;
				return true;
			}
		}
		
		return false;
	}

	public void useAllItems() {
		
		for(Item item : inventory) {
			if (item != null) {
			item.use();
			}
		}
	}
	
	public static void main(String[] args) {
		Inventory inven1 = new Inventory(3);
	
		inven1.put(new Medicine("��ȭ��", 4200));
		inven1.put(new Bread("�佺��", 2500));
		inven1.put(new IceCream("�����ĸ���", 1500));
		
		inven1.useAllItems();
		
		// *Item�� �־�� �ϴ� �ڸ��� Item�� ��ӹ��� ��� �͵��� �� �� �ִ�
//		for (int i = 0; i < 4; ++i) {
//			if (inven1.put(new IceCream("�����ĸ���", 3000))) {
//				System.out.println("�������� �� ���� put()���� true�� ���ϵ�");
//			} else {
//				System.out.println("�������� �� �� ���� put()���� false�� ���ϵ�");
		
//		inven1.put(new Bread("�佺��", 3000));
//		inven1.put(new Medicine("��ȭ��",3000));

	}
}
