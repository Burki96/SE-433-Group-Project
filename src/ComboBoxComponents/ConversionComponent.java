package ComboBoxComponents;

import java.awt.Component;

import Calculators.Operations.Operation;

public class ConversionComponent extends Component 
{
	public ConversionComponent(String n,Operation op) 
	{
		this.setName(n);
		this.operation = op;
	}
	private Operation operation;
    public String toString() {
        return this.getName();
    }
    public Operation GetOperation()
    {
    	return this.operation;
    }
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
