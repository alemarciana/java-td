package dungeons;
public class Ninja extends Human{
	public Ninja(String name){
		this.name = name;
		this.stealth = 10;
	}
	public void steal(Human human){
		if ( this.health == 0 ){
			System.out.println(this.deadMessage);
		}
		else {
			System.out.println(this.name + " ha robado " + this.stealth + " puntos de vida a " + human.name);
			human.health -= this.stealth;
			this.health += this.stealth;
			check(human);
		}
	}
	public void runAway(){
		this.health -= 10;
		check(this);
	}
}
