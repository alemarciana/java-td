package dungeons;
public class Human {
	protected int strength, stealth, intelligence, health;
	public Human(){
		strength = 3;
		stealth = 3;
		intelligence = 3;
		health = 100;
	}
	public void attack(Human human){
		human.health -= this.strength;
	}
	public void getStats(){
		System.out.println("Strength: "+strength);
		System.out.println("Stealth: "+stealth);
		System.out.println("Intelligence: "+intelligence);
		System.out.println("Health: "+health);
	}
}
