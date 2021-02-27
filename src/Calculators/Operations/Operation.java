package Calculators.Operations;

import BasicConverter.BasicConverter;
import Calculators.BasicCalculator.BasicCalculator;

public abstract class Operation {
	
	protected BasicCalculator calculator;
	protected BasicConverter converter;
	abstract public void Execute();

}
