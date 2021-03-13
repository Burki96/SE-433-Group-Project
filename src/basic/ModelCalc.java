package basic;



public class ModelCalc{
		private double secondOperand = 0.00;
	    private double firstOperand = 0.00;
		private String displayValue = "";
		private String op = "";
		private String prevPressedButton = "";
		private boolean firstInput = true;
	    private boolean decimalPoint = false;
	    private boolean operator = false;
	    private BiOperation oper;

	
		public String getDisplayValue() {
			return displayValue;
		}

		private void reset(String d) {
			this.secondOperand = 0;
			this.firstInput = true;
			this.decimalPoint = false;
			this.displayValue = d;
			this.prevPressedButton = "";
			this.operator = false;
			this.op = "";
		}
		private boolean isDigit(String d) {
			return "0123456789".indexOf(d) >= 0;
		}
		
		public void performButtonAction(String buttonValue) {
			
			String val = isDigit(buttonValue) ? "D" : buttonValue;
			switch(val) {
				case "C": 
					System.out.println("Reset");
					reset("0");
					
					
					break;
				case "D":
					System.out.println("Number pressed");
					if (this.op.equals("="))
						reset(buttonValue);
					else {
						addDigit(buttonValue);
						this.operator = false;
					}
					break;
				case "<":
					System.out.println("Backspace");
					backspace();
					this.operator = false;
					break;
				case "+/-":
					changeSign();
					System.out.println("Change sign");
					this.operator = false;
					break;
				case ".":
					System.out.println("Period");
					addDecimalPoint();
					this.operator = false;
					break;
				case "=":
					if (isOperator()) {
						secondOperand = firstOperand;
						execOperation();
					}
					else if (!(this.op.equals("") || this.op.equals("=")))
						execOperation();
					this.op = "=";
					this.operator = false;
					break;
				default:
					if (isDigit(prevPressedButton)) {
						if (firstInput) {
							firstOperand = secondOperand;
							secondOperand = 0;
							firstInput = false;
						} else
						{
							this.secondOperand = getDoubleValue();
							
							execOperation();
						}
						//this.displayValue = "";
						System.out.println("F : " + this.firstOperand);
						System.out.println("S : " + this.secondOperand);
					}
					this.op = buttonValue;
					this.operator = true;
			}
			this.prevPressedButton = buttonValue;
		}

		

		private boolean isOperator() {
			return this.operator;
		}

		private void execOperation() {

			this.oper = OperationFactory.getOp(this.op, this.firstOperand, this.secondOperand);
			this.secondOperand = this.oper.execute();
			this.displayValue = "" + this.secondOperand;
			this.firstOperand = this.secondOperand;
			//this.op = "";
		}

		private void addDecimalPoint() {
			if (! decimalPoint) {	
				decimalPoint = true;	
				if (displayValue.equals("")) {
					displayValue = "0";
				}
				displayValue += ".";
			}
			
		}

		private void addDigit(String buttonValue) {
			if (this.displayValue.equals("0") || this.displayValue.equals("") || this.isOperator()) 
				this.displayValue = buttonValue;
			else
				this.displayValue += buttonValue;
			secondOperand = Double.valueOf(this.displayValue);
			
			
		}

		private void changeSign() {
			this.secondOperand = (-1)*this.secondOperand;
			this.displayValue = String.valueOf(this.secondOperand);
			
			
		}
		
		private double getDoubleValue() {
			String auxDisplay = this.displayValue;
			if(auxDisplay.endsWith(".")) 
				auxDisplay = this.displayValue.substring(0, displayValue.length() - 1);
			return Double.valueOf(auxDisplay);
		}
		private void backspace() {
			if(this.displayValue.endsWith("."))
				this.decimalPoint = false;
			if(this.displayValue.length() > 1) {
				this.displayValue = this.displayValue.substring(0, displayValue.length() - 1);
			}
			else {
				this.displayValue = "0";
				
			}
			this.secondOperand = getDoubleValue();
			
			
		}
	}
