public class Greeter {
	private String createGreeting(String toBeGreeted) {
		return "Hola " + toBeGreeted;
	}
	public String greet() {
		return createGreeting("Mundo");
	}
	public String greet(String firstName, String lastName) {
		return createGreeting(firstName + " " + lastName);
	}
}
