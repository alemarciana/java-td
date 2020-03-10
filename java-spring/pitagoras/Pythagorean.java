import java.lang.Math;
public class Pythagorean {
	public double calculateHypotenuse(int catA, int catB) {
		double result;
		result =  Math.sqrt( ( catA * catA ) + ( catB * catB ) );
		return result;
	}
}
