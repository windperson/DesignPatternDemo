package behavior.mediator.gui;

import behavior.mediator.IDialogMediator;

public class Text extends Widget {

	private String value = "";
	
	public Text(String ID, IDialogMediator mediator) {
		super(ID, mediator);
		// TODO Auto-generated constructor stub
	}
	
	public void setText(String aText){
		value = aText;
	}
	
	public String getText(){
		return value;
	}

}
