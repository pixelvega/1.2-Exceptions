
package exercise1_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
		
	public static Product introduceProduct(Scanner scanner) {
		String	name = "";
		boolean validName = false;
		
		while(!validName) {
			System.out.print("Introduce el nombre del producto:");
			name = scanner.nextLine().trim();
			
			if(name.isEmpty()) {
				System.out.println("Error: El nombre no puede estar vacío.");
				
			} else {
				validName = true;
				
			}
			
		}
		
		double price = 0.0;
		boolean validPrice = false;
		
		while(!validPrice) {
			System.out.print("Introduce el precio del producto:");
			try {
				price = scanner.nextDouble();
				validPrice = true;
				
			} catch(InputMismatchException e) {
				System.out.println("Error: El precio debe ser un número. Inténtalo de nuevo.");
				scanner.next();
				
			}
			
		}
		
		scanner.nextLine();
		return new Product(name, price);
	}
	

  public static void main(String[] args) {
    Sale sale = new Sale();
    Scanner scanner = new Scanner(System.in);
    
    boolean addingProducts = true;
    
    while(addingProducts) {
    	Product product = introduceProduct(scanner);
    	sale.addProduct(product);
    	
    	System.out.print("¿Deseas añadir otro producto? (s/n): ");
    	String response = scanner.nextLine();
    	
    	addingProducts = response.equalsIgnoreCase("s");
    	
    }
    
    scanner.close();
    
    
    try {
      sale.calcTotal();
      
    } catch (EmptySaleException e) {
      System.out.println(e.getMessage());
      
    }

  }

}
