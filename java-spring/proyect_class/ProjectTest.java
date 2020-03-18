public class ProjectTest {
	public static void main(String[] args) {
		// Crear primer proyecto, constructor vacio
		Project project1 = new Project();
		Portfolio portfolio1 = new Portfolio();
		project1.setName("Tomanji Virtual");
		project1.setDescription("Tomanji Virtual en ZOOM");
		project1.setInitialCost(1500);
		project1.elevatorPitch();
		// Crear segundo proyecto, un argumento
		Project project2 = new Project("Maraton Shin Chan");
		project2.setDescription("Maraton Universal de Shin Chan, a realizarse en todas las casas en cuarentena del universo, se transmitirá a traves de canal ETC");
		project2.setInitialCost(0);
		// Crear tercer proyecto, dos argumentos en constructor
		Project project3 = new Project("Tocata Punketa","Buta que me caen mal los pankis ql, arruinan el punk");
		project3.setInitialCost(100000);
		String name3 = project3.getName();
		String desc3 = project3.getDescription();
		System.out.println(name3+"\n"+desc3);
		// Agregar proyectos al primer portafolio
		portfolio1.addProject(project1);
		portfolio1.addProject(project2);
		portfolio1.addProject(project3);
		// Obtener primer portafolio
		System.out.println("\nPrimer Portafolio:");
		portfolio1.getPortfolio();

	}
}
