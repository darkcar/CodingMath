package ch01;

import org.junit.jupiter.api.Test;

public class Lesson1_2 {

	public int leftShift(int num, int n) {
		return num << n;
	}
	
	
	public int rightShift(int num, int n) {
		return num >>> n;
	}
	
	@Test
	public void test() {
		System.out.println("Left Shift: " + leftShift(53, 1));
		System.out.println("Right Shift: " + rightShift(53, 1));
	}
}
