package Helpers;

public abstract class RoterData {
	private static final int[] R1forward = {4,10,12,5,11,6,3,16,21,25,13,19,14,22,24,7,23,20,18,15,0,8,1,17,2,9};
	private static final int[] R2forward = {0,9,3,10,18,8,17,20,23,1,11,7,22,19,12,2,16,6,25,13,15,24,5,21,14,4};
	private static final int[] R3forward = {1,3,5,7,9,11,2,15,17,19,23,21,25,13,24,4,8,22,6,0,10,12,20,18,16,14};
	private static final int[] R4forward = {4,18,14,21,15,25,9,0,24,16,20,8,17,7,23,11,13,5,19,6,10,3,2,12,22,1};
	private static final int[] R5forward = {21,25,1,17,6,8,19,24,20,15,18,3,13,7,11,23,0,22,12,9,16,14,5,4,2,10};
	
	private static final int[] R1reverse = {20,22,24,6,0,3,5,15,21,25,1,4,2,10,12,19,7,23,18,11,17,8,13,16,14,9};
	private static final int[] R2reverse = {0,9,15,2,25,22,17,11,5,1,3,10,14,19,24,20,16,6,4,13,7,23,12,8,21,18};
	private static final int[] R3reverse = {19,0,6,1,15,2,18,3,16,4,20,5,21,13,25,7,24,8,23,9,22,11,17,10,14,12};
	private static final int[] R4reverse = {7,25,22,21,0,17,19,13,11,6,20,15,23,16,2,4,9,12,1,18,10,3,24,14,8,5};
	private static final int[] R5reverse = {16,2,24,11,23,22,4,13,5,19,25,14,18,12,21,9,20,3,10,6,8,0,17,15,7,1};
	
	private static final int R1notch[] = {16,17};
	private static final int R2notch[] = {4,5};
	private static final int R3notch[] = {21,22};
	private static final int R4notch[] = {9,10};
	private static final int R5notch[] = {25,0};
	
	public static int[] getR1forward() {
		return R1forward;
	}
	public static int[] getR2forward() {
		return R2forward;
	}
	public static int[] getR3forward() {
		return R3forward;
	}
	public static int[] getR4forward() {
		return R4forward;
	}
	public static int[] getR5forward() {
		return R5forward;
	}
	public static int[] getR1reverse() {
		return R1reverse;
	}
	public static int[] getR2reverse() {
		return R2reverse;
	}
	public static int[] getR3reverse() {
		return R3reverse;
	}
	public static int[] getR4reverse() {
		return R4reverse;
	}
	public static int[] getR5reverse() {
		return R5reverse;
	}
	public static int[] getR1notch() {
		return R1notch;
	}
	public static int[] getR2notch() {
		return R2notch;
	}
	public static int[] getR3notch() {
		return R3notch;
	}
	public static int[] getR4notch() {
		return R4notch;
	}
	public static int[] getR5notch() {
		return R5notch;
	}
}
