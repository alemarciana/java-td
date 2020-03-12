public class PuzzleJavaTest {
	public static void main(String[] args){
		PuzzleJava puzzle = new PuzzleJava();
		// First Method / Exercise
		System.out.println("Primer Ejercicio");
		int[] arrMethod1 = {3,5,1,2,7,9,8,13,25,32};
		System.out.println(puzzle.sumAndPositives(arrMethod1));
		// Second Method / Exercise
		System.out.println("Segundo Ejercicio");
		String[] arrMethod2 = {"Nancy","Jinichi","Fujibayashi","Momochi","Ishikawa"};
		System.out.println(puzzle.shuffleAndAdd(arrMethod2));
		// Third Method / Exercise
		System.out.println("Tercer Ejercicio");
		puzzle.shuffleAbc();
		// Fourth Method / Exercise
		System.out.println("Cuarto Ejercicio:\n"+puzzle.randInt());
		// Fifth Method / Exercise
		System.out.println("Quinto Ejercicio:");
		puzzle.randSort();
		// Sixth Method / Exercise
		System.out.println("Sexto Ejercicio:\n"+puzzle.randStr());
		// Seventh Method / Exercise
		System.out.println("Septimo Ejercicio:\n"+puzzle.randList());
	}
}
