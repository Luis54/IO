package Diapositivas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReader2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//solo para archvo de texto
		File inFile = new File("/home/matinal/Descargas/nombres_mujer.txt");
		File onFile = new File("/home/matinal/Descargas/nombres_mujer_copiado.txt");
		//stream elegido FileReader
		//lectura
		
		//trabajando con jdk7 nos permite iniciar los stream en el bloque try-catch
		//y no hace falta cerrarlos en un bloque finally
		try (BufferedReader in = new BufferedReader(new FileReader(inFile));
				BufferedWriter out = new BufferedWriter(new FileWriter(onFile))){
			String c = "";
			while((c = in.readLine()) !=null)
				out.write(c+"\n");
		
			
		}
		catch(IOException e){
			e.printStackTrace();
		}
		System.out.println("Programa acabado");
	
	}
}