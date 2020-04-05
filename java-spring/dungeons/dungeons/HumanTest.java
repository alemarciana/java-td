package dungeons;
import java.util.ArrayList;
import java.util.Arrays;
public class HumanTest {
	public static void main(String[] args){
		// Inicializar personajes
		ArrayList<Human> characters = new ArrayList<Human>();
		Human human1 = new Human("Diego");
		Human human2 = new Human("Patricio");
		Wizard wizard1 = new Wizard("Merlin");
		Samurai samurai2 = new Samurai("[REDACTED]");
		Ninja ninja1 = new Ninja("Ninja");
		characters.add(human1); characters.add(human2); characters.add(wizard1); characters.add(samurai2); characters.add(ninja1);
		// Iniciar juego
		human1.attack(human2);
		wizard1.fireBall(human1);
		wizard1.heal(human2);
		samurai2.deathBlow(wizard1);
		ninja1.steal(samurai2);
		samurai2.meditate();
		human2.attack(wizard1);
		// Obtener estadisticas de los personajes
		for ( Human h : characters ){
			h.getStats();
		}
	}
}
