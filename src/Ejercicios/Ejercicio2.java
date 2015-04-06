package Ejercicios;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File inFile = new File("/home/matinal/IO/ejercicioFileOutputStream.txt");
		File inFile2 = new File("/home/matinal/IO/ejercicioFDataOutputSteam.txt");
		//creamos los stream con estilo jdk 1.7
		//usamos buffer para mejorar rendimiento
		try (BufferedInputStream in1 = new BufferedInputStream(new FileInputStream(inFile));
				DataInputStream in2 = new DataInputStream(new BufferedInputStream(new FileInputStream(inFile2)))){
			//hacemos la lectura
			System.out.println("Caso de FileInputSream");
			int c;
			while((c=in1.read())!=-1)
				System.out.println(c+" - ");
			System.out.println("Caso de DataInputStream");
			//usamos metodo avaible() que nos indica el numero de bytes que
			//quedan por leer
			while(in2.available()!=0){
				System.out.println((c=in2.readInt())+" - ");
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
