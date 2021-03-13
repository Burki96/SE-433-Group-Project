package basic;



public abstract class OperationFactory {

	public static  BiOperation getOp(String opType, double fo, double so){
		BiOperation oper = null;
		switch(opType) {
    	case "+": 
    		oper = new Addition(fo, so);
    		break;
    	case "-":
    		oper = new Substraction(fo, so);
    		break;
    	case "*":
    		oper = new Multiplication(fo, so);
    		break;
		case "/":
			oper = new Division(fo, so);
    		break;
		case "%":
			oper = new Percentage(fo, so);
    		break;
		}
	      
	      return oper;
	   }
	}
	   
