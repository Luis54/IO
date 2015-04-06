package Ejercicios;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Ejericcio3 {

	public static void main(String[] args) {
		File outFile = new File("/home/matinal/IO/ejercicio3txt");
		//creamos el stream reader para volvar los datos
		
		try (PrintWriter out = new PrintWriter(new BufferedOutputStream(new FileOutputStream(outFile)),true);){
			for (int i = 20; i <= 40; i++) {
				out.println(i);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		//vamos a leer el fichero
		//no hace falta crear un nuevo descriptor de fichero (File)
		//pero si hay que crear el flujo de entrada
		try (BufferedReader in = new BufferedReader(new FileReader(outFile));) {
			String c ="";
			while((c=in.readLine())!=null)
				System.out.print(c+" - ");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
