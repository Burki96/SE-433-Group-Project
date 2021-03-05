package Calculators.Operations;

import Calculators.BasicCalculator.BasicCalculator;
import Calculators.BasicConverter.BasicConverter;

public abstract class Operation {
	
	protected BasicCalculator calculator;
	protected BasicConverter converter;
	abstract public void Execute();

}
