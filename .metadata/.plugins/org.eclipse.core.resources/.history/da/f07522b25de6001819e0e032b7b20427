package Machine;


public class Plugboard {
	int[] pairs;
	
	public Plugboard(int[] pairs) {
		this.pairs = pairs;
	}
	
	public int usePlugboard(int letter) {
		int result = -1;
		for (int i = 0; i < pairs.length; i++) {
			if(pairs[i] == letter) {
				result = i;
				break;
			}
		}
		if(result == -1)
			return -1;
		else if(result%2 == 0)
			return pairs[result+1];
		else
			return pairs[result-1];
	}

}
