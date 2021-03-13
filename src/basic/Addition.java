package basic;

public class Addition extends BiOperation{
    
	  
    public Addition(double fOperand, double sOperand) {
		super(fOperand, sOperand, "+");
    }
	
	public double execute(){
		return this.firstOperand + this.secondOperand;
	}

	
}