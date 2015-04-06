package Ejercicios;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Creamos el archivo de salida
		File outFile = new File("/home/matinal/IO/ejercicioFileOutputStream.txt");
		File outFile2 = new File("/home/matinal/IO/ejercicioFDataOutputSteam.txt");
		//añadimos un buffer intermedio para mejorar rendimiento programa
		//usamos estilo jdk 1.7, se cierran los stream solos
		try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(outFile));
			DataOutputStream out2 = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(outFile2)))){
			//añadimos los 20 numero al fichero
			for (int i = 20; i <= 40; i++) {
				out.write(i);
				out2.writeInt(i);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
