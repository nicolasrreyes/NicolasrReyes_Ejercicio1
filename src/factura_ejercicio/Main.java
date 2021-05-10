package factura_ejercicio;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
				
		Date fecha = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		sdf.format(fecha);
		String printFecha = sdf.format(fecha);
		
		Scanner scan = new Scanner(System.in);
		
		String nombre, domicilio;
		String producto1, producto2, siguienteArticulo; 
		
		int cant1, cant2;
		double precioU1, precioU2, Subtotal, total, IVA;
		
		
		
		
		nombre = solicitarNombreCliente(scan);
		domicilio = solicitarDomicilio(scan);
		
		
			
		
		
	
		System.out.println("Ingrese el Producto");
		producto1 = scan.nextLine();
		System.out.println("Ingrese la Cantidad");
		cant1 = scan.nextInt();
		scan.nextLine();
		System.out.println("Ingrese el Precio Unitario");
		precioU1 = scan.nextDouble();
		
		
		System.out.println("Siguiente Producto");
		producto2 = scan.next();
		scan.nextLine();
		System.out.println("Ingrese la Cantidad");
		cant2 = scan.nextInt();
		scan.nextLine();
		System.out.println("Ingrese el Precio Unitario");
		precioU2 = scan.nextDouble();
		
		
		Subtotal = precioU1 * cant1 + precioU2 * cant2;
		IVA = Subtotal * 0.21;
		total = IVA + Subtotal;
		
		
		
		
		
		
		
		System.out.println("\n********************************************************\n");
		System.out.println("Fecha " + printFecha );
		System.out.println("\n********************************************************\n");
		System.out.println("Nombre: " + nombre);
		System.out.println("Domicilio: " + domicilio);
		System.out.println("\n********************************************************\n");
		System.out.println("Cant.  \t\t    |    Descripcion  |  P. Unit  |   P. Total ");
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
		System.out.println(  cant1 +  " \t\t    |    " + producto1 + "   |   " + precioU1 + "   |   " + (cant1 * precioU1) );
		System.out.println(  cant2 +  " \t\t    |    " + producto2 + "   |   " + precioU1 + "   |   " + (cant2 * precioU2) );
		System.out.println("IVA: " + IVA);
		System.out.println("Subtotal (sin IVA): " + Subtotal);
		System.out.println("Total: " + total);
		System.out.println("*************************************************************************************");
	
	
	
	}

	private static String solicitarDomicilio(Scanner scan) {
		String domicilio;
		System.out.println("Domicilio Cliente");
		domicilio = scan.nextLine();
		return domicilio;
	}

	private static String solicitarNombreCliente(Scanner scan) {
		String nombre;
		System.out.println("Nombre Cliente");
		nombre = scan.nextLine();
		return nombre;
	}
	

}
