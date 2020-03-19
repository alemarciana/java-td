package dungeons;
public class Wizard extends Human{
	public Wizard(String name){
		this.name = name;
		this.health = 50;
		this.intelligence = 8;
	}
	public void heal(Human human){
		human.health += this.intelligence;
	}
	public void fireBall(Human human){
		human.health -= (this.intelligence*3);
	}
}
