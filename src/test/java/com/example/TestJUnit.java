package com.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJUnit {

	@Test
	public void test() {
		String str = "Junit is working fine";
		assertEquals("Junit is working fine",str);
	}

}
