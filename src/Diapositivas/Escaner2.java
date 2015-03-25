package Diapositivas;

import java.util.Scanner;

public class Escaner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = "Luis:usero:21: true:212,21";
		Scanner in = new Scanner(frase);
		in.useDelimiter("\\s*:\\s*");
		String nombre = in.next();
		String apellido = in.next();
		int edad = in.nextInt();
		boolean condicion = in.nextBoolean();
		double pago = in.nextDouble();
		System.out.println("Nombre: "+nombre+ " Apellido: "+apellido);
		System.out.println("Edad: "+edad+"\t"+"Condicion: "+condicion);
		System.out.println("Pago: "+pago);
		in.close();
	}

}
