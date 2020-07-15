package com.test;

import org.testng.SkipException;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

public class secondTest {

	@Test
	public void fail1() {
		throw new NullPointerException("Will fail");
	}

	@Test
	public void fail2() throws IOException {
		throw new IOException("Will fail");
	}

	@Test
	public void test1() {
		throw new RuntimeException();
	}

	@Test
	
	public void test2() {
		assertTrue(true, "test is passed");
	}

	
	@Test
	public void test5() {
		assertFalse(true, "test is failed");
	}
	
	@Test
	public void testskipped() {
		throw new SkipException("skipped");
	}
}
