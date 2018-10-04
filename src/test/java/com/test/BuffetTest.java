package com.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.main.Buffet;

public class BuffetTest {

	public int number;
	public Buffet buf;
	
	@Before
	public void before() {
		this.number = 0;
		this.buf = new Buffet();
		}
	
	
	@Test
	public void getNumberFormSetNumberByNumber5() {
		this.number = 5;
		
		int expecteds = 5;
		
		buf.setNumber(this.number);
		int actuals = buf.getNumber();
		
		Assert.assertEquals(expecteds, actuals);
	}

}
