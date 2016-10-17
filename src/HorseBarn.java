import java.util.ArrayList;

public class HorseBarn {
	ArrayList<Horse> horses = new ArrayList<Horse>();

	public void addHorse(Horse s) {
		horses.add(s);
	}

	public Horse[] getSpaces() {
		Horse[] h = new Horse[horses.size() - 1];
		for (int i = 0; i < horses.size(); i++) {
			h[i] = horses.get(i);
		}
		return h;
	}
}
