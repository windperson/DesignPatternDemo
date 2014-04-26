package structure.memento;

public class Player {
	private int hp = 100;
	private int ep = 100;
	
	public void setHP(int aHP){
		hp = aHP;
	}
	public void setEP(int aEP){
		ep = aEP;
	}
	
	public int getHP(){
		return hp;
	}
	public int getEP(){
		return ep;
	}
	
	public void fight(){
		hp -= 10;
		ep += 5;
	}
	
	public void fightToDead(){
		hp = 0;
		ep = 0;
	}
	
	public void displayState(){
		System.out.println("player state:");
		System.out.println("hp=" + hp);
		System.out.println("ep=" + ep);
	}

	
	/*
	 * JAVA nested class
	 * http://stackoverflow.com/questions/70324/java-inner-class-and-static-nested-class
	 */
	public static class Memento{
		
		private final int _hp;
		private final int _ep;
		
		//private ctor. in inner class can only be access in outter class
		//http://stackoverflow.com/a/12542295
		private Memento(int aHp, int aEp){
			_hp = aHp;
			_ep = aEp;
		}
		
		private int getHP(){
			return _hp;
		}
		
		private int getEP(){
			return _ep;
		}
		
	}
	
	public Memento createMemento(){
		return new Memento(hp, ep);
	}
	
	public void setMemento(Memento aMemento){
		hp = aMemento.getHP();
		ep = aMemento.getEP();
	}
}
