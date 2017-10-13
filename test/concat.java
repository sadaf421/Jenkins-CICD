package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class concat {

	@Test
	public void test() {
		junit obj =new junit();
		String result=obj.concatinate("hello","sadaf");
		assertEquals("hellosadaf", result);
		
	}

}
