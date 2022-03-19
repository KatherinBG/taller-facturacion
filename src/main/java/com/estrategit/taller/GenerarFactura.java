package com.estrategit.taller;

import java.util.HashMap;

public class GenerarFactura {
	
	public static void main(String[] args) {
		System.out.println("-------INICIA ATENCION CLIENTE------");
		Thread cajera1 = new Thread(
				new Runnable() {
					public void run() {
						for (int i = 0; i < 5; i++ ) {
							System.out.println("Cajera 1");
							
							GenerarFactura fact= new GenerarFactura();
							
								
							
						}
					}
				}
				);
		Thread cajera2 = new Thread(
					new Runnable() {
						public void run() {
							for (int i =0; i < 5; i++ ) {
								System.out.println("Cajera 2");
							}
						}
					}
				);
		Thread cajera3 = new Thread ( new Runnable() {
							public void run() {
								for (int i =0; i < 5; i++ ) {
									System.out.println("Cajera 3");
								}
							}
						});	
		
		Thread cajera4 = new Thread ( new Runnable() {
			public void run() {
				for (int i =0; i < 5; i++ ) {
					System.out.println("Cajera 4");
				}
			}
		});	
		
		Thread cajera5 = new Thread ( new Runnable() {
			public void run() {
				for (int i =0; i < 5; i++ ) {
					System.out.println("Cajera 5");
				}
			}
		});	
		
		
		cajera1.start();
		cajera2.start();
		cajera3.start();
		cajera4.start();
		cajera5.start();
		System.out.println("-------FINALIZA ATENCION AL CLIENTE------");
	}


}
