package basic;

public class Substraction extends BiOperation{
    

    public Substraction(double fOperand, double sOperand) {
		super(fOperand, sOperand, "-");
    }
	
	public double execute(){
		return this.firstOperand - this.secondOperand;
	}
}