package calculator;
public abstract class Operation implements CalcInterface {
	protected double result;
	protected double OperandOne;
	protected double OperandTwo;
	protected static String[] ValidOperations = {"+","-"};
	protected String Operation;
	public String[] getValidOperations(){
		return ValidOperations;
	}
	@Override
	public void setOperandOne(double operand){
		OperandOne = operand;
	}
	@Override
	public void setOperandTwo(double operand){
		OperandTwo = operand;
	}
	@Override
	public void performOperation(){
		switch (Operation) {
			case "+": result = ( OperandOne + OperandTwo );
				  break;
			case "-": result = ( OperandOne - OperandTwo );
		}
	}
	public double getResult(){
		return result;
	}
}
