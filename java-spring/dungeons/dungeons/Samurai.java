package dungeons;
public class Samurai extends Human{
	public Samurai(String name){
		this.name = name;
		this.health = 200;
	}
	public void deathBlow(Human human){
		human.health = 0;
		this.health -= ( this.health / 2);
		System.out.println(this.name + " ha asesinado a " + human.name);
	}
	public void meditate(){
		this.health += ( this.health / 2);
		System.out.println(this.name + " ha recuperado vida");
	}
	public int howMany(){
		return this.health;
	}
}
