package com.test;

import static org.testng.Assert.assertFalse;

//import static org.junit.Assert.assertFalse;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class secondTest {

//	@Test
//	public void fail1() {
//		throw new NullPointerException("Will fail");
//	}

//	@Test
//	public void fail2() throws IOException {
//		throw new IOException("Will fail");
//	}

//	@Test
//	public void test1() {
//		throw new RuntimeException();
//	}

	@Test
	public void test2() {

		for (int i = 0; i < 200; i++)
			System.out.println("testing jenkins....");

		Assert.assertTrue(true, "test is passed");
	}

//	@Test
//	public void test5() {
//		assertFalse(true, "test is failed");
//	}

	@Test
	public void testskipped() {
		throw new SkipException("skipped");
	}
}
