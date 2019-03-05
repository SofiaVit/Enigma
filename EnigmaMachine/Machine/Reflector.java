package Machine;


public class Reflector {
	private int[] reflector = {24,17,20,7,16,18,11,3,15,23,13,6,14,10,12,8,4,1,5,25,2,22,21,9,0,19};
	
	public int encodeLetter(int letter) {
		for (int i = 0; i < reflector.length; i++) {
			if(reflector[i] == letter)
				return i;
		}
		return -1;
	}

}
