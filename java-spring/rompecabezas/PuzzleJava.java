import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class PuzzleJava {
	public ArrayList<Integer> sumAndPositives( int[] arr) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int sum = 0;
		for ( int i : arr ) {
			sum+=i;
			if ( i > 10 ) {
				list.add(i);
			}
		}
		System.out.println(sum);
		return list;

	}
	public ArrayList<String> shuffleAndAdd( String[] arr) {
		ArrayList<String> list = new ArrayList<String>();
		Collections.shuffle(Arrays.asList(arr));
		for ( String i : arr ) {
			System.out.println(i);
			if ( i.length() > 5 ) {
				list.add(i);
			}
		}
		return list;
	}
	public void shuffleAbc() {
		Character[] abc = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		Character[] vowels = {'a','e','i','o','u'};
		Collections.shuffle(Arrays.asList(abc));
		System.out.println("La ultima letra es "+abc[abc.length-1]);
		System.out.println("La primera letra es "+abc[0]);
		if ( Arrays.asList(vowels).contains(abc[0]) ) {
			System.out.println("La primera letra es una vocal UwU");
		}
	}
	public ArrayList<Integer> randInt() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		while ( list.size() < 10 ) {
			Random ran = new Random();
			int n = ran.nextInt(101);
			if ( n >= 55 && n <= 100 ) {
				list.add(n);
				}
		}
		return list;
	}
	public void randSort() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Object> list2 = new ArrayList<Object>();
		while ( list.size() < 10 ) {
			Random ran = new Random();
			int n = ran.nextInt(101);
			if ( n >= 55 && n <= 100 ) {
				list.add(n);
			}
		}
		Collections.sort(list);
		Integer min = list.get(0);
		Integer max = list.get(0);
		for ( int i = 0; i < list.size(); i++ ) {
			if ( list.get(i) < min ) {
				min = list.get(i);
			}
			if ( list.get(i) > max ) {
				max = list.get(i);
			}
		}
		System.out.println(list);
		System.out.println("El valor minimo de la lista es: "+min);
		System.out.println("El valor maximo de la lista es: "+max);
	}
	public String randStr() {
		Random rand = new Random();
		char[] abc = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		String str1 = "";
		while ( str1.length() < 5 ) {
			str1 += abc[rand.nextInt(25)];
		}
		return str1;
	}
	public ArrayList<String> randList() {
		Random rand = new Random();
		char[] abc = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		ArrayList<String> list = new ArrayList<String>();
		while ( list.size() < 10 ) {
			String str = "";
			while ( str.length() < 5 ) {
				str += abc[rand.nextInt(25)];
			}
			list.add(str);
		}
		return list;
	}
}
