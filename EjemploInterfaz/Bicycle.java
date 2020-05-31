package EjemploInterfaz;
public class Bicycle implements OperateBicycle {
	private int speed;
	public Bicycle(){
		speed = 0;
	}
	// Metodo static que llama al metodo static de la interfaz
	public static void staticMethod() {
		OperateBicycle.staticMethod();
	}
	// Implementar speedUp
	public void speedUp(int increment){
		speed += increment;
	}
	// Implementar applyBrakes
	public void applyBrakes(int decrement){
		speed -= decrement;
	}
	public int getSpeed(){
		return speed;
	}
}
