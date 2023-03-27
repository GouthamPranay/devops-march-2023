package org.tektutor.frontend;

import org.tektutor.businesslayer.*;

public class Frontend {

	public String getModuleName() {

		BusinessLayer bl = new BusinessLayer();
		bl.getModuleName();

		return "Frontend Module";
	}

}
