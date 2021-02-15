package Events;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import Calculators.MainProgramSingleton;
import Calculators.Factories.ButtonFactory;
import Calculators.Windows.MainMenu;

public class ClosingEvent extends WindowAdapter {
	

	public ClosingEvent() {
		
	}
	@Override
    public void windowClosing(WindowEvent event) {
        ExitFunction();
    }
	public void ExitFunction() {
		ButtonFactory.Terminate();
		MainProgramSingleton.Terminate();
		MainMenu.Terminate();
		System.exit(0);
	}

}
