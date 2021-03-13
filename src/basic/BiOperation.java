package basic;

public abstract class BiOperation {
    
    double firstOperand;
    double secondOperand;
	String operator;

    
    public BiOperation(double fOperand, double sOperand, String operator) {
        
        this.firstOperand = fOperand;
        this.secondOperand = sOperand;
        this.operator = operator;
    }
   
    
    public void setFirstOperand(double fOperand) {
    	this.firstOperand = fOperand;
    }
    
    public void setSecondOperand(double sOperand) {
    	this.secondOperand = sOperand;
    }
    
    public abstract double execute();

}