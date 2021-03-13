package basic;

public class Multiplication extends BiOperation{
    
    public Multiplication(double fOperand, double sOperand) {
		super(fOperand, sOperand, "*");
    }
	
	public double execute(){
		return this.firstOperand * this.secondOperand;
	}
}