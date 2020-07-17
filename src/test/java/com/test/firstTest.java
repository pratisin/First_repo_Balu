package com.test;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class firstTest {

	
	@Test
	@Category(com.test.firstTest.class)
	public void testmethod1() throws JSONException, IOException {

		String payload = getPayload("gitLabjob.json");
		JSONObject json = new JSONObject(payload);
		System.out.println(json.get("build_id"));

		System.out.println("after update");
		json.put("build_id", 101);
		System.out.println(json.get("build_id"));

	}

	@Test
	@Category(com.test.firstTest.class)
	public void testmethod2() {
		assertTrue(true);
	}

	public static String getPayload(final String fileNm) throws IOException, JSONException {

		final File file = new File("src/test/resources/" + fileNm);

		final Path path = file.toPath();
		System.out.println("-------------path for json file :" + file.getAbsolutePath());

		final StringBuilder sb = new StringBuilder();
		final List<String> content = Files.readAllLines(path, Charset.defaultCharset());

		for (final String string : content) {

			sb.append(string);
		}

		final String jsonstring = sb.toString();

		return jsonstring;
	}

	@Test
	@Category(com.test.firstTest.class)
	public void emptytest() {

	}

	@Test
	@Category(com.test.firstTest.class)
	public void failedtest() {

//		assertEquals(4, 5);
		assertFalse(true, "balu-test is failed");
	}

	@Ignore
	@Test()
	@Category(com.test.firstTest.class)
	public void disabledtest() {
		System.out.println("disabled test");

	}
}
