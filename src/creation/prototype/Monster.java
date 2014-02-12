package creation.prototype;

public class Monster implements Cloneable {
	private int hp = 100;
	private int power = 50;
	Exterior ext = null;
	
	public Monster(int hp, int power, String fileName){
		
		System.out.println("call Monster ctor.");
		
		this.hp = hp;
		this.power = power;
		this.ext = new Exterior(fileName);
	}
	
	public int getHP(){
		return hp;
	}
	
	public int getPower(){
		return power;
	}
	
	public Exterior getExterior(){
		return ext;
	}
	
	@Override
	public Monster clone(){
		Monster newObject = null;
		try{
			newObject = (Monster)super.clone();
		}catch(CloneNotSupportedException e){
			return null; //should not happen.
		}
		
		newObject.hp = this.hp;
		newObject.power = this.power;
		newObject.ext = this.ext.clone();
		return newObject;
	}

}
