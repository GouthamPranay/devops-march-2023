package org.tektutor.frontend;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;

public class FrontendTest {

	private String actualResponse;
	private String expectedResponse;
	private Frontend fe;

	@Before
	public void init() {
		fe = new Frontend();
	}

	@Test
	public void testFrontend() {
		actualResponse = fe.getModuleName();
		expectedResponse = "Frontend Module";

		assertEquals ( expectedResponse, actualResponse );
	}

	@After
	public void cleanUp() {
		fe = null;
	}

}
