package com.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.main.Calculate;

public class CalculateTest {
	public int score;
	public Calculate cal;
	
	@Before
	public void initScoreZero() {
		this.score = 0;
	}
	
	@Before
	public void initCalculateClass() {
		this.cal = new Calculate();
	}
	
	@Test
	public void getScoreFormSetScoreByScore100() {
		this.score = 100;
		
		int expecteds = 100;
		
		cal.setScore(this.score);
		int actuals =cal.getScore();
		
		Assert.assertEquals(expecteds, actuals);
		
	}
	
	@Test
	public void getGradeAFormSetScoreAndCalculateByScore100() {
		this.score = 100;
		
		String expecteds = "A";
		
		cal.setScore(this.score);
		String actuals =cal.calculateGrade();
		
		Assert.assertEquals(expecteds, actuals);
		
	}
	@Test
	public void getGradeAFormSetScoreAndCalculateByScore90() {
		this.score = 90;
		
		String expecteds = "A";
		
		cal.setScore(this.score);
		String actuals =cal.calculateGrade();
		
		Assert.assertEquals(expecteds, actuals);
		
	}
	@Test
	public void getGradeAFormSetScoreAndCalculateByScore80() {
		this.score = 80;
		
		String expecteds = "A";
		
		cal.setScore(this.score);
		String actuals =cal.calculateGrade();
		
		Assert.assertEquals(expecteds, actuals);
		
	}
	@Test
	public void getGradeBPlusFormSetScoreAndCalculateByScore79() {
		this.score = 79;
		
		String expecteds = "B+";
		
		cal.setScore(this.score);
		String actuals =cal.calculateGrade();
		
		Assert.assertEquals(expecteds, actuals);
		
	}
	@Test
	public void getGradeBFormSetScoreAndCalculateByScore70() {
		this.score = 70;
		
		String expecteds = "B";
		
		cal.setScore(this.score);
		String actuals =cal.calculateGrade();
		
		Assert.assertEquals(expecteds, actuals);
		
	}
	@Test
	public void getGradeBFormSetScoreAndCalculateByScore72() {
		this.score = 72;
		
		String expecteds = "B";
		
		cal.setScore(this.score);
		String actuals =cal.calculateGrade();
		
		Assert.assertEquals(expecteds, actuals);
		
	}
	@Test
	public void getGradeCPlusFormSetScoreAndCalculateByScore69() {
		this.score = 69;
		
		String expecteds = "C+";
		
		cal.setScore(this.score);
		String actuals =cal.calculateGrade();
		
		Assert.assertEquals(expecteds, actuals);
		
	}
	@Test
	public void getGradeCPlusFormSetScoreAndCalculateByScore64() {
		this.score = 64;
		
		String expecteds = "C";
		
		cal.setScore(this.score);
		String actuals =cal.calculateGrade();
		
		Assert.assertEquals(expecteds, actuals);
		
	}
	public void getGradeCPlusFormSetScoreAndCalculateByScore60() {
		this.score = 60;
		
		String expecteds = "C";
		
		cal.setScore(this.score);
		String actuals =cal.calculateGrade();
		
		Assert.assertEquals(expecteds, actuals);
		
	}
	@Test
	public void getGradeDPlusFormSetScoreAndCalculateByScore59() {
		this.score = 59;
		
		String expecteds = "D+";
		
		cal.setScore(this.score);
		String actuals =cal.calculateGrade();
		
		Assert.assertEquals(expecteds, actuals);
		
	}
	@Test
	public void getGradeDPlusFormSetScoreAndCalculateByScore55() {
		this.score = 55;
		
		String expecteds = "D+";
		
		cal.setScore(this.score);
		String actuals =cal.calculateGrade();
		
		Assert.assertEquals(expecteds, actuals);
		
	}
	@Test
	public void getGradeDFormSetScoreAndCalculateByScore54() {
		this.score = 54;
		
		String expecteds = "D";
		
		cal.setScore(this.score);
		String actuals =cal.calculateGrade();
		
		Assert.assertEquals(expecteds, actuals);
		
	}
	@Test
	public void getGradeDFormSetScoreAndCalculateByScore50() {
		this.score = 50;
		
		String expecteds = "D";
		
		cal.setScore(this.score);
		String actuals =cal.calculateGrade();
		
		Assert.assertEquals(expecteds, actuals);
		
	}
	
	@Test
	public void getGradeFFormSetScoreAndCalculateByScore49() {
		this.score = 49;
		
		String expecteds = "F";
		
		cal.setScore(this.score);
		String actuals =cal.calculateGrade();
		
		Assert.assertEquals(expecteds, actuals);
		
	}
	@Test
	public void getGradeFFormSetScoreAndCalculateByScore0() {
		this.score = 0;
		
		String expecteds = "F";
		
		cal.setScore(this.score);
		String actuals =cal.calculateGrade();
		
		Assert.assertEquals(expecteds, actuals);
		
	}
	@Test
	public void getGradeFFormSetScoreAndCalculateByScore20() {
		this.score = 20;
		
		String expecteds = "F";
		
		cal.setScore(this.score);
		String actuals =cal.calculateGrade();
		
		Assert.assertEquals(expecteds, actuals);
		
	}

}
