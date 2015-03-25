package Diapositivas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = "Esto es un texto que vamos a enviar al fichero\n";
		File inFile = new File("/home/matinal/Descargas/nombres_mujer.txt");
		File onFile = new File("/home/matinal/Descargas/nombres_mujerCopia.txt");
		//Vamos añadir a un flujo de salida el String texto y las diez primeras
		//lineas de inFile
		//trbajamos con try-catch con jdk7
		try(BufferedReader in = new BufferedReader(new FileReader(inFile));
				PrintWriter out = new PrintWriter(onFile,"ISO-8859-1")){
			//usamos readLine que suministra BufferedReader en la lectura del fichero
			//usamos el write para escribir los string
			out.write(texto);
			//vamos a añadir 10 lineas del archivo de entrada
			String lineaLeida;
			for (int i = 0; i < 10; i++) {
				lineaLeida=in.readLine();
				if(lineaLeida == null)
					break;
				out.write(lineaLeida+"\n");
			}
			
		}
		catch(IOException e){
			e.printStackTrace();
		}
		System.out.println("El programa a terminado");
	}

}
