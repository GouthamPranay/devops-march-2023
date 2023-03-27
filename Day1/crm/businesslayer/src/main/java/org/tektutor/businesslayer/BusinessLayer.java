package org.tektutor.businesslayer;

import org.tektutor.backend.*;

public class BusinessLayer {

	public String getModuleName() {
		
		Backend be = new Backend();
		be.getModuleName();

		return "BusinessLayer Module";
	}

}
