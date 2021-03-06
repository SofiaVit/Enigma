package Machine;

import Helpers.RoterData;

public class Roter {
	private int[] forward;
	private int[] reverse;
	private int offset;
	private int setting;
	private int[] notch;
	
	public Roter(int roterNumber, int setting, int offset) {
		//Set setting array
		this.setting = setting;
		this.offset = offset;
		//Set forward.reverse and notch
		if(roterNumber == 1) {
			this.reverse = RoterData.getR1reverse();
			this.forward = RoterData.getR1forward();
			this.notch = RoterData.getR1notch();
		}
		else if(roterNumber == 2) {
			this.reverse = RoterData.getR2reverse();
			this.forward = RoterData.getR2forward();
			this.notch = RoterData.getR2notch();
		}
		else if(roterNumber == 3) {
			this.reverse = RoterData.getR3reverse();
			this.forward = RoterData.getR3forward();
			this.notch = RoterData.getR3notch();
		}
		else if(roterNumber == 4) {
			this.reverse = RoterData.getR4reverse();
			this.forward = RoterData.getR4forward();
			this.notch = RoterData.getR4notch();
		}
		else if(roterNumber == 5) {
			this.reverse = RoterData.getR5reverse();
			this.forward = RoterData.getR5forward();
			this.notch = RoterData.getR5notch();
		}
	}
	
	public boolean rotate() {
		if(this.offset < 25) {
			this.offset = this.offset+1;
		}
		else
			this.offset = 0;
		if (offset == notch[1])
			return true;
		return false;
	}
	
	
	public int encode(int letter,int forOrRev) {
		int PCalc = letter+offset-setting;
		if(PCalc > 25)
			PCalc = PCalc % 26;
		else if(PCalc < 0)
			PCalc = PCalc + 26;
		if(forOrRev == 0)
			letter = forward[PCalc] - offset + setting;
		else
			letter = reverse[PCalc] - offset + setting;
		if(letter > 25)
			letter = letter % 26;
		else if(letter < 0)
			letter = letter + 26;
		return letter;
	}
	
	public int getNotch() {
		return notch[0];
	}
	public int getOffset() {
		return offset;
	}
}
