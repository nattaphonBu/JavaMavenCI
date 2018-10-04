package com.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class ExampleTest {

	@Test
	public void test() {
		// init value
		int score = 80;
		// expect
		String expecteds = "A";
		// actual
		String actuals = "B";
		// test
		Assert.assertEquals(expecteds, actuals);
	}

}
