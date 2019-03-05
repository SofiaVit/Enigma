package Helpers;

import java.util.ArrayList;

public abstract class HelpFunctions {
	
	public static int[] stringToInt(String string) {
		string = string.toUpperCase();
		ArrayList<Integer> array = new ArrayList<Integer>();
		for (int i = 0; i < string.length(); i++) {
			if(string.charAt(i) == ' ')
				array.add(-3);
			else 
				array.add(string.charAt(i)-'A');
		}
		int[] digits = new int[array.size()];
		int j=0;
		for (int i : array) {
			digits[j] = i;
			j++;
		}
		return digits;
	}
	
	public static String stringToChar(ArrayList<Integer> encodedString) {
		String output = "";
		for (Integer i : encodedString) {
			if(i == -3)
				output += ' ';
			else {
				int b = i + 65;
				output += (char)b;
			}
		}
		return output;
	}
	
}
