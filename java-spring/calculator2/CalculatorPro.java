package calculator2;
public class CalculatorPro extends Operation implements java.io.Serializable {
	public CalculatorPro(){};
	public static void main(String[] args){
		CalculatorPro calc = new CalculatorPro();
		System.out.println(args[1]);
		try {
		for (String arg : args){
			if ( CalculatorPro.isNumeric(arg) ) {
				calc.performOperation(Double.parseDouble(arg));
			}
			else {
				calc.performOperation(arg);
			}
			//System.out.println(arg);
		}
		System.out.println(calc.operations);
		calc.performOperation("=");
		System.out.println(calc.getResult());
		}
		catch (IndexOutOfBoundsException e){
			System.out.println("Missing arguments.");
		}
	}
}
