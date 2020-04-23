package calculator2;
import java.util.ArrayList;
public abstract class Operation implements CalcInterface {
	protected double result;
	protected ArrayList<Double> values = new ArrayList<Double>();
	protected ArrayList<String> operations = new ArrayList<String>();
	protected static String[] validOperations = {"+","-","*","/","="};
	public double getResult(){
		return result;
	}
	public void performOperation(double num){
		values.add(num);
	}
	public void performOperation(String op){
		if ( op.equals("=") ){
			// placeholder
			double partialResult = values.get(0);
			for (int i = 1; i < values.size(); i++){
				switch (operations.get(i-1)){
					case "+": partialResult += values.get(i);
						  break;
					case "-": partialResult -= values.get(i);
						  break;
					case "*": partialResult *= values.get(i);
						  break;
					case "/": partialResult /= values.get(i);
						  break;
				}
			}
			result = partialResult;
		}
		else {
			operations.add(op);
		}
	}
	public static boolean isNumeric(String str) {
		return str.matches("-?\\d+(\\.\\d+)?");
	}
}
