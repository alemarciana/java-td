package zookeeper;
public class Bat extends Mammal {
	public Bat() {
		this.energyLevel = 300;
	}
	public void fly(){
		System.out.println("*flap flap flap*");
		this.energyLevel -= 50;
	}
	public void eatHumans(){
		System.out.println("Bueno, no importa");
		this.energyLevel += 25;
	}
	public void attackTown(){
		System.out.println("Jueeeeee");
		this.energyLevel -= 100;
	}
}
