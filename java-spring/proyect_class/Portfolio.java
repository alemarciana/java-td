import java.util.ArrayList;
public class Portfolio {
	private ArrayList<Project> projects = new ArrayList<Project>();
	public void addProject(Project project){
		projects.add(project);
	}
	public double getPortfolioCost(){
		double sum = 0;
		for (Project p : projects){
			sum += p.getInitialCost();
		}
		return sum;
	}
	public void getPortfolio(){
		for (Project p : projects){
			p.elevatorPitch();
		}
		System.out.println(getPortfolioCost());
	}
}
