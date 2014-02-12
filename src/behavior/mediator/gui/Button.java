package behavior.mediator.gui;

import behavior.mediator.IDialogMediator;

public class Button extends Widget {

	public Button(String ID, IDialogMediator mediator) {
		super(ID, mediator);
	}
	
	public void click(){
		this.changed();
	}

}
