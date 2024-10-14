package exercise2_1;

public class Main {

	public static void main(String[] args) {
		
		// InputMismatchException
	    byte byteValue = InputKeyboard.readByte("Introduce un número byte: ");
	    System.out.println("Byte ingresado: " + byteValue);
	    
	    int intValue = InputKeyboard.readInt("Introduce un número entero: ");
	    System.out.println("Byte ingresado: " + intValue);
	    
	    float floatValue = InputKeyboard.readFloat("Introduce un número decimal: ");
	    System.out.println("Byte ingresado: " + floatValue);
	    
	    double doubleValue = InputKeyboard.readDouble("Introduce un número decimal: ");
	    System.out.println("Byte ingresado: " + doubleValue);

	}

}
