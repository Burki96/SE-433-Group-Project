
public class CalculatorSingleton 
{
	private static CalculatorSingleton instance = null;
	
	private static CalculatorSingleton GetInstance() 
	{
		if(instance == null) {
			
			instance = new CalculatorSingleton();
		}
		return instance;
	}
}
