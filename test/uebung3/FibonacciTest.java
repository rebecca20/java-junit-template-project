package uebung3;

import static org.junit.Assert.*;

import org.junit.Test;

import uebung3.Fibonacci;

public class FibonacciTest {
	
	@Test
	public void testFibonacci(){
		Fibonacci f = new Fibonacci();
		int n = 0;
		int[] b = new int[n];
		b = f.calcFibonacci(n);
		assertEquals("0 is ok", b[0], 0);
	}
}
