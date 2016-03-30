package com.epam.lib.transport.control;

import java.util.Scanner;

public class ScannerOfMenuInputSingleton {
	
	private static ScannerOfMenuInputSingleton scannerOfMenuInputSingleton;
	private Scanner scanner = new Scanner(System.in);

	public static synchronized ScannerOfMenuInputSingleton getInstance(){
		if (scannerOfMenuInputSingleton == null){
			scannerOfMenuInputSingleton = new ScannerOfMenuInputSingleton();
		}
		return scannerOfMenuInputSingleton;
	}
	
	public synchronized void nextLine(){
		scanner.nextLine();
	}	
	
	public synchronized int getNumber(String info) throws InputNumberException {
		System.out.print(info);
		
		if (this.scanner.hasNextInt())
			return this.scanner.nextInt();
		else
			this.scanner.nextLine();
			throw new InputNumberException("Not integer value");
	}
}
