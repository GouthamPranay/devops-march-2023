package org.tektutor.businesslayer;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;

public class BusinessLayerTest {

	private String actualResponse;
	private String expectedResponse;
	private BusinessLayer bl;

	@Before
	public void init() {
		bl = new BusinessLayer();
	}

	@Test
	public void testBusinessLayer() {
		actualResponse = bl.getModuleName();
		expectedResponse = "BusinessLayer Module";

		assertEquals ( expectedResponse, actualResponse );
	}

	@After
	public void cleanUp() {
		bl = null;
	}

}
