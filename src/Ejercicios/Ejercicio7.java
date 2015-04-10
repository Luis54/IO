package Ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "/home/matinal/";
		File inFile1 = new File(path+"Cadenas.java");
		File inFile2 = new File(path+"Cadena1.java");
		File outFile1 = new File(path+"Cadenas_back.java");
		try (BufferedReader in1 = new BufferedReader(new FileReader(inFile1));
				BufferedReader in2 = new BufferedReader(new FileReader(inFile2));
				BufferedWriter out = new BufferedWriter(new FileWriter(outFile1))){
			//Vamos a leer String con readLine
			String linea="";
			String texto="";
			while((linea=in1.readLine())!=null)
				texto+=(linea+"\n");
				String definitivo1 = texto.substring(0,texto.length()-2);
					out.flush();	
			while((linea=in2.readLine())!=null)		
				definitivo1+=linea+"\n";
			String definitivo2=definitivo1.substring(0,definitivo1.length()-2);
			out.write(definitivo2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}
