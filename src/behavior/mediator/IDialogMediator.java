package behavior.mediator;

import behavior.mediator.gui.Widget;

public interface IDialogMediator {
	
	void createWidgets();
	void showDialog();
	void closeDialog();
	Widget getWidget(String ID);
	
	void widgetChanged(Widget aWidget);

}
