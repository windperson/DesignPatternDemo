package behavior.mediator;

import java.util.HashMap;

import behavior.mediator.gui.*;

public class FontDialogMediator implements IDialogMediator {

	public final static String FONTLIST_ID = "fontList";
	public final static String FONTNAME_ID = "fontName";
	public final static String OKBUTTON_ID = "okButton";
	
	private ListBox fontList;
	private Text fontName;
	private Button okButton;
	private HashMap<String, Widget> _comps;
	
	@Override
	public void createWidgets() {
		fontList = new ListBox(FONTLIST_ID, this);
		fontName = new Text(FONTNAME_ID, this);
		okButton = new Button(OKBUTTON_ID, this);
		
		_comps = new HashMap<>();
		_comps.put(fontList.getID(), fontList);
		_comps.put(fontName.getID(), fontName);
		_comps.put(okButton.getID(),  okButton);
		
		System.out.println("Create Widgets");
	}

	@Override
	public void showDialog() {
		System.out.println("Show the font dialog with a font list, a font name, and an OK button.");
	}

	@Override
	public void closeDialog() {
		// TODO Auto-generated method stub
		System.out.println("Close the font dialog.");
	}

	@Override
	public Widget getWidget(String ID) {
		return _comps.get(ID);
	}

	@Override
	public void widgetChanged(Widget aWidget) {
		
		if(aWidget == fontList){
			setFontTextAsFontListSelectedItem();
		}
		else if(aWidget == okButton){
			applyFontChangeAndDissmissDialog();
		}

	}
	
	private void setFontTextAsFontListSelectedItem(){
		System.out.println("Set text value to the selected item in the font list");
		fontName.setText(fontList.getSelection());
	}
	
	private void applyFontChangeAndDissmissDialog(){
		System.out.println("Apply font change and dismiss dialog");
		this.closeDialog();
	}

}
