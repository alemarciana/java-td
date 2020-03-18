public class Project {
	private String nombre;
	private String descripcion;
	private double initialCost;
	public void elevatorPitch() {
		System.out.println(nombre+"("+initialCost+"): "+descripcion);
	}
	public Project() { 
	}
	public Project(String name) {
		nombre = name;
	}
	public Project(String name, String description) {
		nombre = name;
		descripcion = description;
	}
	public void setName(String name) {
		nombre = name;
	}
	public void setDescription(String description) {
		descripcion = description;
	}
	public void setInitialCost(int cost){
		initialCost = cost;
	}
	public String getName() {
		return nombre;
	}
	public String getDescription() {
		return descripcion;
	}
	public double getInitialCost() {
		return initialCost;
	}
}
