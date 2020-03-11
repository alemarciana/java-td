import java.util.ArrayList;
public class BasicJava {
	public ArrayList<Integer> OneToNum(int num){
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 1; i < ( num + 1 ); i++){
			arr.add(i);
		}
		return arr;
	}
	public void OddsToNum(int num){
		for (int i = 1; i < ( num + 1 ); i+=2){
			System.out.println(i);
		}
	}
	public void SumToNum(int num){
		int sum = 0;
		for (int i = 0; i < ( num + 1 ); i++){
			sum+=i;
			System.out.println("Nuevo Numero: "+i+" Suma: "+sum);
		}
	}
	public void printArray(int[] arr){
		for (int i : arr){
			System.out.println(i);
		}
	}
	public int returnMax(int[] arr){
		int max = arr[0];
		for (int i : arr){
			if ( i > max ){
				max = i;
			}
		}
		return max;
	}
	public double getAverage(int[] arr){
		int sum = 0;
		for ( int i : arr ){
			sum+=i;
		}
		float avg = sum / arr.length;
		return avg;
	}
	public ArrayList<Integer> OddsToArray(int num){
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 1; i < ( num + 1 ); i+=2){
			arr.add(i);
		}
		return arr;
	}
	public int GreaterThan(int[] arr, int num){
		int cont = 0;
		for (int i : arr){
			if ( i > num ){
				cont++;
			}
		}
		return cont;
	}
	public int[] sqrtArr(int[] arr){
		for ( int i = 0; i < arr.length; i++){
			arr[i] = arr[i]*arr[i];
		}
		return arr;
	}
	public int[] rmNegatives(int[] arr){
		for ( int i = 0; i < arr.length; i++){
			if ( arr[i] < 0 ) {
				arr[i] = 0;
			}
		}
		return arr;
	}
	public Object[] minMaxAvg(int[] arr){
		int min = arr[0];
		int max = arr[0];
		int sum = 0;
		for (int i : arr){
			if (i < min){
				min = i;
			}
			if (i > max){
				max = i;
			}
			sum+=i;
		}
		double avg = sum / arr.length;
		Object[] mma = {min,max,avg};
		return mma;
	}
}
