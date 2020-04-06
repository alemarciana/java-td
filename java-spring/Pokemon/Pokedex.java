package Pokemon;
import java.util.ArrayList;
public class Pokedex extends AbstractPokemon {
	private int myPokemon = Pokemon.getCount();
	ArrayList<Pokemon> pokeList = new ArrayList<Pokemon>();
	public void listPokemon(){
		for ( Pokemon poke : pokeList ){
			System.out.println(poke.getName());
		}
	}
	public Pokemon createPokemon(String name, String type, int health){
		Pokemon poke = super.createPokemon(name,type,health);
		pokeList.add(poke);
		return poke;
	}
}
