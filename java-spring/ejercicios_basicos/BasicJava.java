import java.util.ArrayList;
public class BasicJava {
	public ArrayList<Integer> OneToNum(int num){
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 1; i < ( num + 1 ); i++){
			arr.add(i);
		}
		return arr;
	}
	public ArrayList<Integer> OddsToNum(int num){
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 1; i < ( num + 1 ); i+=2){
			arr.add(i);
		}
		return arr;
	}
	public void SumToNum(int num){
		int sum = 0;
		for (int i = 0; i < ( num + 1 ); i++){
			sum+=i;
			System.out.println("Nuevo Numero: "+i+" Suma: "+sum);
		}
	}
}
