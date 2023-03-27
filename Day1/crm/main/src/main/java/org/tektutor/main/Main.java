package org.tektutor.main;

import org.tektutor.frontend.Frontend;

public class Main {

	public String getModuleName() {
		return "Main Module";
	}

	public static void Main ( String[] args ) {

		Frontend fe = new Frontend();
		System.out.println ( fe.getModuleName() );

	}

}
