package ComboBoxListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;

import ComboBoxComponents.ConversionComponent;

public class ComboBoxSwitchListener implements ActionListener
{
	private JComboBox<ConversionComponent> TypeSelectionBox;
	public void SetSelector(JComboBox<ConversionComponent> selection) 
	{
		this.TypeSelectionBox = selection;
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		((ConversionComponent)this.TypeSelectionBox.getSelectedItem()).GetOperation().Execute();
	}

}
