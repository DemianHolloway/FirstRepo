package quiz;

import java.util.Scanner;



import myobj.tong.Barrel;

public class C07_PirateGame {

/*
	  1. �÷��̾ ���ư��鼭 ���ϴ� ���� Į�� ���
	  
	  2. �߸��� ���� Į�� ������ ���� �������� ���ư��� ���ӿ� �й��Ѵ�
	  
	 */
	Scanner sc;

	Barrel barrel;
	int mode;
	
	int turn;
	int numOfPlayer;
	int computerChoice;
	
	public C07_PirateGame(int mode) {
		this.barrel = new Barrel(20);
		this.mode = mode;
		this.numOfPlayer = 2;
		this.sc = new Scanner(System.in);
		this.computerChoice = (int)(Math.random() * 20);
	}
	

	public C07_PirateGame(int mode, int numOfPlayer) {
		this(mode);
		this.numOfPlayer = numOfPlayer;
	
	}
	
	public void start() {
		switch (this.mode){
			case 1:
				pvp();
				break;
			case 2:
				pvc();
				break;
			default:
				System.out.println("��ȣ�� ���� ��带 �����ϼ���.\n1. PVP���\t2.PVC���\n");
				System.out.println("==========================");
				
				break;
		}
	}
	
	public void config(int mode) {
		this.mode = mode;
	
	}
	
	void pvp() {
		while (true) {
			System.out.println((turn +1 )+ "��");
			System.out.print("'Player'" + (turn % numOfPlayer + 1) + "'�� ���� > ");
			int slot = sc.nextInt();
			
			boolean fork_result = barrel.fork(slot);
			if (fork_result) {
				
				if (barrel.checkGameOver()) {
					System.out.println("��������� ���ư����ϴ�...");
					System.out.println("'Player'" + (turn % numOfPlayer + 1) + "'�� �й�! > ");
					break;
					
				}
				
				turn++;
		
//			if (barrel.fork(slot)) {
//				turn++;
			}
		}
	}
	
	void pvc() {
		//���� ����� ���� �����ּ���
		while (true) {
			System.out.println((turn +1 )+ "��");
			System.out.print("'Player�� ���� > ");
			int slot = sc.nextInt();
			System.out.print("'Computer�� ���� > " + computerChoice);			
			
			boolean fork_result = barrel.fork(slot);
			if (fork_result) {
				
				if (barrel.checkGameOver()) {
					System.out.println("��������� ���ư����ϴ�...");
					System.out.println("'Player�� �й�! > "); }
					else if (barrel.checkGameOver()) {
					System.out.println("��������� ���ư����ϴ�...");
					System.out.println("'Computer�� �й�! > ");
					
					break;
					
				}
				
				turn++;
			}
		}
	}

	public static void main(String[] args) {
		C07_PirateGame testGame = new C07_PirateGame(99,3);
		
		testGame.start();
		testGame.config(2);
		testGame.start();
		
		System.out.println("�׽�Ʈ ���� ��!");
	
	}
}