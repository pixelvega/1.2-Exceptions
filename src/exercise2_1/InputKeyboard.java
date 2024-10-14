package exercise2_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputKeyboard {
	
	private static final Scanner scanner = new Scanner(System.in);
	
	// Methods for InputMismatchException
	public static byte readByte(String message) {
		boolean isValid = false;
		byte value = -1;
		
		while (!isValid) {
			System.out.print(message);
			try {
				value = scanner.nextByte();
				isValid = true;
				
			} catch (InputMismatchException e) {
				System.out.println("Formato incorrecto, se espera un número byte.");
				scanner.nextLine();
				
			}
		}
		
		return value;
		
	}
	
	
	public static int readInt(String message) {
		boolean isValid = false;
		int value = -1;
		
		while (!isValid) {
			System.out.print(message);
			try {
				value = scanner.nextInt();
				isValid = true;
				
			} catch (InputMismatchException e) {
				System.out.println("Formato incorrecto, se espera un número entero.");
				scanner.nextLine();
				
			}
		}
		
		return value;
		
	}
	
	public static float readFloat(String message) {
		boolean isValid = false;
		float value = 0.0f;
		
		while (!isValid) {
			System.out.print(message);
			
			try {
				value = scanner.nextFloat();
				isValid = true;
				
			} catch (InputMismatchException e) {
				System.out.println("Formato incorrecto, se espera un número decimal.");
				scanner.nextLine();
				
			}
		}
		
		return value;
		
	}
	
	public static double readDouble(String message) {		
		boolean isValid = false;
		double value = 0.0;
		
		while (!isValid) {
			System.out.print(message);
			
			try {
				value = scanner.nextDouble();
				isValid = true;
				
			} catch (InputMismatchException e) {
				System.out.println("Formato incorrecto, se espera un número decimal.");
				scanner.nextLine();
				
			}
		}
		
		return value;
		
	}

	

}
