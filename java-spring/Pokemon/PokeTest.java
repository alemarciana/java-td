package Pokemon;
public class PokeTest {
	public static void main(String[] args){
		Pokedex dex1 = new Pokedex();
		Pokemon poke1 = dex1.createPokemon("Pikachu","Electric",60);
		Pokemon poke2 = dex1.createPokemon("Bulbasaur","Grass",50);
		poke1.attackPokemon(poke2);
		System.out.println(dex1.pokemonInfo(poke2));
		dex1.listPokemon();
	}
}
