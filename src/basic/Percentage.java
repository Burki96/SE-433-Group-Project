package basic;

public class Percentage extends BiOperation{
    
    public Percentage(double fOperand, double sOperand) {
		super(fOperand, sOperand, "%");
    }
	
	public double execute(){
		return (this.firstOperand/100) * this.secondOperand;
	}
}
