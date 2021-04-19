package myobj;

public class Communication {

	public int listne;
	public int speak;
	public long action;
	double empathy;
	String color;
	
	
	public void listning() {
		speak--;
		listne += 15;
	}
	public void feeling() {
		empathy--;
		action += 10;	
		
	}
}

class Life {
	
	int hp;
	int mp;
	int ap;
	int sp;
	
	public Life() {
		hp = hp * 2 ;
		mp += 5 ;
	}
	public void Friendly() {
		ap ++;
		sp ++;
		
	}
}

class Stat {
	
	int str;
	int dex;
	int con;
	int wis;
	int cha;
	
	public void Strength() {
		this.str = str * 5 ;
	}	
	public void Wisdom() {
		this.wis ++;
	}
}

