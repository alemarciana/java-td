package fizzbuzz;
public class FizzBuzz {
	public String run(int num){
		if ( num % 3 == 0 && num % 5 == 0 ){
			return "FizzBuzz";
		}
		else {
			if ( num % 3 == 0 ){
				return "Fizz";
			}
			else if ( num % 5 == 0){
				return "Buzz";
			}
			else{
				String num2 = Integer.toString(num);
				return num2;
			}
		}
	}
}
