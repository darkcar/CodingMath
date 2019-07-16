package ch01;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;

/**
 * Convert Decimal to Binary Number
 * @author k11237
 *
 */
public class Lesson1_1 {
	public static String decimalToBinary(int decimalSource) {
		BigInteger bi = new BigInteger(String.valueOf(decimalSource));
		return bi.toString(2);
	}
	
	public static int binaryToDecimal(String binarySource) {
		BigInteger bi = new BigInteger(binarySource, 2);
		return Integer.parseInt(bi.toString());
	}
	
	@Test
	public void test() {
		System.out.println(Lesson1_1.decimalToBinary(12));
	}
}
