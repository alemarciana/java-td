package Pokemon;
public class Pokemon {
	private String name, type;
	private int health;
	private static int count = 0;
	public Pokemon(String name, String type, int health){
		setName(name);
		setType(type);
		setHealth(health);
		count++;
	}
	public void attackPokemon(Pokemon pokemon){
		pokemon.health -= 10;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setType(String type){
		this.type = type;
	}
	public String getType(){
		return this.type;
	}
	public void setHealth(int health){
		this.health = health;
	}
	public int getHealth(){
		return this.health;
	}
	public static int getCount(){
		return count;
	}
}
