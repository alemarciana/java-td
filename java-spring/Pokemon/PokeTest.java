package Pokemon;
public class PokeTest {
	public static void main(String[] args){
		Pokedex dex1 = new Pokedex();
		Pokedex dex2 = new Pokedex();
		Pokemon poke1 = dex1.createPokemon("Pikachu","Electric",60);
		Pokemon poke2 = dex1.createPokemon("Bulbasaur","Grass",50);
		poke1.attackPokemon(poke2);
		System.out.println(dex1.pokemonInfo(poke2));
		dex1.listPokemon();
		Pokemon poke3 = dex2.createPokemon("Eevee","Normal",70);
		poke3.attackPokemon(poke1);
		System.out.println(dex1.pokemonInfo(poke1));
		// this should give an error, try to get info on poke3 via dex1
		System.out.println(dex1.pokemonInfo(poke3));
		dex2.listPokemon();
		// but it doesn't, I don't get this fuck interfaces
		/*try {
			System.out.println(dex1.pokemonInfo(poke3));
		}*/
	}
}
