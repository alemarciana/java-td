import java.util.ArrayList;
public class VehicleTest {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		// Create car vehicle
		Vehicle redCar = new Vehicle();
		redCar.setNumberOfWheels(4);
		redCar.setColor("red");
		redCar.setType("Car");
		// Create motorbike vehicle
		Vehicle whiteBike = new Vehicle();
		whiteBike.setNumberOfWheels(2);
		whiteBike.setColor("white");
		whiteBike.setType("Bike");
		// Create skate vehicle
		Vehicle skate = new Vehicle();
		skate.setType("Skate");
		skate.setColor("Green");
		skate.setNumberOfWheels(4);
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		// Create bicycle vehicle
		Vehicle bicycle = new Vehicle(2,"yellow","Bicycle");
		// Add vehicles to List
		vehicles.add(redCar);
		vehicles.add(whiteBike);
		vehicles.add(skate);
		vehicles.add(bicycle);
		for ( Vehicle i : vehicles ) {
			System.out.println("Vehicle Type: "+i.getType()+"\nNumber of Wheels: "+i.getNumberOfWheels()+", Color: "+i.getColor()+"\n");
		}
	}
}
