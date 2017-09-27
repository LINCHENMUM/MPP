package gy_test.ffinal.ab;

import java.math.BigInteger;
import java.util.stream.Stream;

public class A {

	static void evenNumbers(int n) {
		Stream.iterate(BigInteger.ZERO, num -> num.add(BigInteger.ONE).add(BigInteger.ONE)).limit(n)
				.forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		evenNumbers(8);
	}
}
