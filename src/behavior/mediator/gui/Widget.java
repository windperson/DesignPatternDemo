package behavior.mediator.gui;

import behavior.mediator.IDialogMediator;

public abstract class Widget {

	private String _id = null;
	protected IDialogMediator _mediator = null;
	
	public Widget(String ID, IDialogMediator mediator){
		_id = ID;
		_mediator = mediator;
	}
	
	public String getID() {
		return _id;
	}
	
	public void changed(){
		_mediator.widgetChanged(this);
	}
	
}
