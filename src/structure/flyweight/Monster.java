package structure.flyweight;

public class Monster{
	private int hp = 100;
	private int power = 50;
	private String _name;
	
	private IExterior _ext = null;
	
	private Color _color = null;
	private Style _style = null;
	
	public Monster(String name, int hp, int power, String fileName){
		
		//System.out.println("call Monster ctor.");
		
		this._name = name;
		this.hp = hp;
		this.power = power;
		this._ext = ExteriorFactory.getInstance().getFlyweight(fileName);
		
		_color = new Color();
		_style = new Style();
		((SharedExterior) this._ext).get3DModel().set_color(_color);
		((SharedExterior) this._ext).get3DModel().set_style(_style);
	}
	
	public int getHP(){
		return hp;
	}
	
	public int getPower(){
		return power;
	}

}
