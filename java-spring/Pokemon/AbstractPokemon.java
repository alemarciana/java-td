package Pokemon;
public abstract class AbstractPokemon implements PokemonInterface {
	public Pokemon createPokemon(String name, String type, int health){
		return new Pokemon(name, type, health);
	}
	public String pokemonInfo(Pokemon pokemon){
		return ("Name: " + pokemon.getName() + ", Type: " + pokemon.getType() + ", Health: " + pokemon.getHealth());
	}
}
