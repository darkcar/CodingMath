package ch01;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;

public class Lesson1_3 {
	
	public String logicalShift(int num) {
		BigInteger bi = new BigInteger(String.valueOf(num));
		return bi.toString(2);
	}
	
	@Test
	public void test() {
		int n = 53;
		System.out.println("Binary Representation: " + logicalShift(n));
	}
}
