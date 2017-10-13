package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class multiply {

	@Test
	public void test() {
		junit objs =new junit();
		int results=objs.multiply(2,4);
		assertEquals(8,results);
	}

}
