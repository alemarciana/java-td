package dungeons;
public class Human {
	protected int strength, stealth, intelligence, health;
	protected String name;
	public Human(){
		strength = 3;
		stealth = 3;
		intelligence = 3;
		health = 100;
	}
	public Human(String name){
		this.name = name;
		strength = 3;
		stealth = 3;
		intelligence = 3;
		health = 100;
	}
	public void attack(Human human){
		System.out.println(this.name+" attacked "+human.name+"!");
		System.out.println(human.name+" lost "+this.strength+" HP");
		human.health -= this.strength;
	}
	public void getStats(){
		System.out.println("Strength: "+strength);
		System.out.println("Stealth: "+stealth);
		System.out.println("Intelligence: "+intelligence);
		System.out.println("Health: "+health);
	}
}
