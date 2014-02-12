package behavior.mediator.gui;

import behavior.mediator.IDialogMediator;

public class ListBox extends Widget {

	public ListBox(String ID, IDialogMediator mediator) {
		super(ID, mediator);
	}
	
	public String getSelection(){
		return "consolas";
	}
	
	public void onSelect(){
		this.changed();
	}

}
