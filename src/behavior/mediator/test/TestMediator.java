package behavior.mediator.test;

import static org.junit.Assert.*;

import org.junit.Test;

import behavior.mediator.*;
import behavior.mediator.gui.*;

public class TestMediator {

	@Test
	public void test() {
		IDialogMediator mediator = new FontDialogMediator();
		
		mediator.createWidgets();
		mediator.showDialog();
		assertEquals("",((Text) mediator.getWidget(FontDialogMediator.FONTNAME_ID)).getText());
		
		((ListBox) mediator.getWidget(FontDialogMediator.FONTLIST_ID)).onSelect();
		((Button) mediator.getWidget(FontDialogMediator.OKBUTTON_ID)).click();
		assertEquals("consolas",((Text) mediator.getWidget(FontDialogMediator.FONTNAME_ID)).getText());
	}

}
