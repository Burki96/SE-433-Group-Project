package Events.ConverterButtonEvents;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Controllers.MainMenuController;
import Controllers.UnitConverterController;

public class ConverterMainMenuSwitch implements ActionListener
{
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		UnitConverterController.Turnoff();
		MainMenuController.Start();
		
	}
}
