package com.estrategit.taller;

import java.util.HashMap;

public class SuperMercado {

	public static void main(String[] args) {
		

		Cajera caj1 = new Cajera("David","001");
		Cajera caj2 = new Cajera("Monica","002");
		Cajera caj3 = new Cajera("Angel","003");
		Cajera caj4 = new Cajera("Juan","004");
		Cajera caj5 = new Cajera("Marcelo","005");
	
		caj1.start();
		caj2.start();
		caj3.start();
		caj4.start();
		caj5.start();
		
		
		
	}

}
