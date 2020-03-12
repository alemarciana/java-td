import java.util.HashMap;
import java.util.Set;
public class Hashmatique {
	public static void main(String[] args) {
		HashMap<String, String> trackList = new HashMap<String, String>();
		trackList.put("Lo que un dia fue no sera","En tus manos aprendi a beber agua...");
		trackList.put("With the Love in my Heart","Got no wings to fly me, no song to sing me...");
		trackList.put("Thinking","Think about you sometimes, ooo...");
		trackList.put("No Quiero Volver a Ver","No dejemos que en la vida nos amarguen por la culpa de esta sociedad...");
		trackList.put("Friday","우~ 금요일에 시간 어때요");
		Set<String> tracks = trackList.keySet();
		// Print lyrics for "Friday" song
		System.out.println("Friday: "+trackList.get("Friday"));
		// Print lyrics for every song on trackList
		System.out.println("\nSongs: \n");
		for ( String song : tracks ) {
			System.out.println(song+": "+trackList.get(song));
		}
	}
}
