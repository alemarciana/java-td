package dungeons;
public class HumanTest {
	public static void main(String[] args){
		Human human1 = new Human("Diego");
		Human human2 = new Human("Patricio");
		Wizard wizard1 = new Wizard("Merlin");
		human1.attack(human2);
		wizard1.fireBall(human1);
		wizard1.heal(human2);
		human1.getStats();
		human2.getStats();
	}
}
