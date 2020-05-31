package EjemploInterfaz;
public interface OperateBicycle {
	double myConstant = 3.0;
	// Metodo Predeterminado no necesita implementacion
	default void sayHello() {
		System.out.println("Hola UwU");
	}
	// Metodo estatico que no necesita implementacion
	static void staticMethod(){
		System.out.println("Hola desde el metodo estatico uwu");
	}
	void speedUp(int increment);
	void applyBrakes(int decrement);
}
