package basic;

public class Division extends BiOperation{
    
    public Division(double fOperand, double sOperand) {
		super(fOperand, sOperand, "/");
    }
	
	public double execute(){
		double _result = 0;

		if  (this.secondOperand == 0) 
			throw new DivideByZeroException();
		else
            _result = this.firstOperand / this.secondOperand;
       
		return _result;
		
	}

	
	
}
