package Events;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import Calculators.MainProgramSingleton;
import Calculators.Factories.ButtonFactory;
import Calculators.Factories.CalculatorActionListenerManager;
import Calculators.Windows.MainMenuController;
import Controllers.CalculatorController;

public class ClosingEvent extends WindowAdapter {
	

	public ClosingEvent() {
		
	}
	@Override
    public void windowClosing(WindowEvent event) {
        ExitFunction();
    }
	public void ExitFunction() {
		MainMenuController.Terminate();
		CalculatorController.Terminate();
		ButtonFactory.Terminate();
		CalculatorActionListenerManager.Terminate();
		MainProgramSingleton.Terminate();
		
		System.exit(0);
	}

}
