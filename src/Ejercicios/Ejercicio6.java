package Ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//descriptor del fichero de texto
		String path = "/home/matinal/";
		File inFile = new File(path+"Cadenas.java");
		//dos ficheros de salida
		File outFile1 = new File(path+"Cadena1.java");
		File outFile2 = new File(path+"Cadena2.java");
		//creamos un array de 1024 byte
		char[] array1 = new char[1024];
		//tamaño del 2 array es el tamaño del fichero menos el tamaño del 1 array
		char[] array2 = new char[(int) (inFile.length()-array1.length)];
		//stream de lectura
		try (BufferedReader in = new BufferedReader(new FileReader(inFile));
				BufferedWriter out1 = new BufferedWriter(new FileWriter(outFile1)); 
				BufferedWriter out2 = new BufferedWriter(new FileWriter(outFile2))){
			//añadir los 1024 byte al array
			in.read(array1); out1.flush();
			out1.write(array1);
			//el resto lo añadimos al segundo array
			in.read(array2);
			out2.write(array2); out2.flush(); //forzamos el volcado del flujo
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
