package org.tektutor.backend;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;

public class BackendTest {

	private String actualResponse;
	private String expectedResponse;
	private Backend be;

	@Before
	public void init() {
		be = new Backend();
	}

	@Test
	public void testBackend() {
		actualResponse = be.getModuleName();
		expectedResponse = "Backend Module";

		assertEquals ( expectedResponse, actualResponse );
	}

	@After
	public void cleanUp() {
		be = null;
	}

}
