import java.util.ArrayList;
public class BasicJavaTest {
	public static void main(String[] args){
		BasicJava basic = new BasicJava();
		// First Method / Exercise
		ArrayList<Integer> a = basic.OneToNum(255);
		for (Integer element : a){
			System.out.println(element);
		}
		// Second Method / Exercise
		ArrayList<Integer> second = basic.OddsToNum(255);
		for (Integer element : second){
			System.out.println(element);
		}
		// Third Method / Exercise
		basic.SumToNum(255);
	}
}
