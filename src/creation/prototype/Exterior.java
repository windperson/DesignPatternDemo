package creation.prototype;

public class Exterior implements Cloneable {
	
	public String source = null;
	
	public Exterior(String fileName){
		source = fileName;
		
		System.out.println("call Exterior ctor.");
		
		//mock code to pretend resource-consuming operation
		try{
			
			Thread.sleep(20);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
	public String getSource(){
		return source;
	}
	
	@Override
	public Exterior clone(){
		Exterior newObject = null;
		try{
			newObject = (Exterior)super.clone();
		}catch(CloneNotSupportedException e){
			return null; //should not happen
		}
		
		//mock code
		fakeMemCopy(this, newObject);
		
		return newObject;
	}
	
	private void fakeMemCopy(Exterior aSource, Exterior aDest){
		try{
			Thread.sleep(5);
		} catch(InterruptedException e){
			e.printStackTrace();
		}
	}

}
