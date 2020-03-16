public class Project {
	String nombre;
	String descripcion;
	public void elevatorPitch() {
		System.out.println(nombre+": "+descripcion);
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
	public void getName() {
		System.out.println(name);
	}
	public void getDescription() {
		Systen.out.println(descripcion);
	}
}
