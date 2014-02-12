package structure.flyweight;

public class SharedExterior implements IExterior {

	public String _source = null;
	public ThreeDModel _model = null;
	
	
	public SharedExterior(String fileName){
		_source = fileName;
		
		System.out.println("call Exterior ctor.");
		
		//mock code to pretend resource-consuming operation
		try{
			
			Thread.sleep(20);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
	
	public void draw(Color aColor, Style aStyle) {
		/*
		 * draw 3D model
		 */
		
	}
	
	public ThreeDModel get3DModel()
	{
		return _model;
	}
	

}
