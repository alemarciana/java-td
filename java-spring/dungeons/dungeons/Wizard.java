package dungeons;
public class Wizard extends Human{
	public Wizard(String name){
		this.name = name;
		this.health = 50;
		this.intelligence = 8;
	}
	public void heal(Human human) {
		if ( this.health == 0 ){
			System.out.println(this.deadMessage);
		}
		else {
			System.out.println(name + " ha curado a " + human.name);
			human.health += this.intelligence;
		}
	}
	public void fireBall(Human human){
		if ( this.health == 0 ){
			System.out.println(this.deadMessage);
		}
		else {
			System.out.println(this.name + " ha lanzado una bola de fuego a " + human.name);
			human.health -= (this.intelligence*3);
			check(human);
		}
	}
}
