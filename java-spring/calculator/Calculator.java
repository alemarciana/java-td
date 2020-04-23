package calculator;
import java.util.Arrays;
public class Calculator extends Operation implements java.io.Serializable {
	public Calculator(){}
	@Override
	public void setOperation(String op){
		if ( Arrays.asList(Calculator.ValidOperations).contains(op)){
			Operation = op;
		}
		else {
			System.out.println("Invalid operator, see --help");
			throw new IllegalArgumentException();
		}
	}
	public static void main(String[] args){
		try {
		if ( args.length < 3 ){
			if ( args.length == 1 ){
				if ( args[0].equals("--help") || args[0].equals("-h") ){
					System.out.println("calculator.Calculator - \"Simple\" Java Calculator\n\nUsage:\n");
					System.out.println("calculator.Calculator [First Operand] [Operation] [Second Operand]\nExample: \"calculator.Calculator 2 + 3\"");
				}
				else {
					throw new IllegalArgumentException("Illegal Argument, see --help for help");
				}
			}
			else {
				System.out.println("Missing arguments, see --help for help");
			}
		}
		else if ( args.length > 3 ){
			System.out.println("Too many arguments, see --help for help");
		}
		else {
			Calculator calc = new Calculator();
			calc.setOperandOne(Integer.parseInt(args[0]));
			calc.setOperation(args[1]);
			calc.setOperandTwo(Integer.parseInt(args[2]));
			calc.performOperation();
			System.out.println(calc.getResult());
		}
		}
		catch ( NumberFormatException e ){System.out.println(e+"\nOperands have to be numbers");}
		catch ( IllegalArgumentException e ){System.out.println(e);}
	}
}
