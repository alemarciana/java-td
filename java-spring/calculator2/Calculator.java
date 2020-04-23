package calculator2;
public class Calculator extends Operation implements java.io.Serializable {
	public Calculator(){};
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.performOperation(2);
		calc.performOperation("+");
		calc.performOperation(3);
		calc.performOperation("*");
		calc.performOperation(4);
		calc.performOperation("/");
		calc.performOperation(5);
		calc.performOperation("=");
		System.out.println(calc.getResult());
	}
}
