package Diapositivas;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class AccesoAleatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//suamos jdk 1.7 no hace falta cerrar el flujo
		try (RandomAccessFile fichero = new RandomAccessFile("/home/matinal/random.dat","rw");){
			//siempre el puntero se encuentra inicialmente en 0
			//todo lo que escriba cambia los valores incilaes
			System.out.println("Puntero del archivo inicialmente en: "+fichero.getFilePointer());
			System.out.println("Tamaño del archivo inicialmente: "+fichero.length());
			for (int i = 0; i < 100; i++) {
				fichero.write(i);
			}
			System.out.println("Tamaño del archivo: "+fichero.length());
			System.out.println("Puntero del archivo: "+fichero.getFilePointer());
			//cambiamos la posicion del puntero 
			fichero.seek(0);
			System.out.println("Puntero del archivo: "+fichero.read());
			fichero.seek(1);
			System.out.println("Puntero del archivo: "+fichero.read());
		

			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
