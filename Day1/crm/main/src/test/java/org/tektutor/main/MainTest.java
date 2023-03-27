package org.tektutor.main;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;

public class MainTest {

	private String actualResponse;
	private String expectedResponse;
	private Main mainObj;

	@Before
	public void init() {
		mainObj = new Main();
	}

	@Test
	public void testMain() {
		actualResponse = mainObj.getModuleName();
		expectedResponse = "Main Module";

		assertEquals ( expectedResponse, actualResponse );
	}

	@After
	public void cleanUp() {
		mainObj = null;
	}

}
