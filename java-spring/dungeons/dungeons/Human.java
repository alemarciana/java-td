package dungeons;
public class Human {
	protected int strength, stealth, intelligence, health;
	protected String name, deadMessage=this.name+" is dead! you cannot perform this action";
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
	public void check(Human human){
		if ( human.health < 0 ){
			human.health = 0;
		}
	}
	public void attack(Human human){
		if ( this.health == 0 ){
			System.out.println(deadMessage);
		}
		else {
			System.out.println(this.name+" attacked "+human.name+"!");
			System.out.println(human.name+" lost "+this.strength+" HP");
			human.health -= this.strength;
			check(human);
		}
	}
	public void getStats(){
		System.out.println(name + " stats:");
		System.out.println("Strength: "+strength);
		System.out.println("Stealth: "+stealth);
		System.out.println("Intelligence: "+intelligence);
		System.out.println("Health: "+health);
	}
}
