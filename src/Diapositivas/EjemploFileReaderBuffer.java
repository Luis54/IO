package Diapositivas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EjemploFileReaderBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//solo para archvo de texto
		File inFile = new File("/home/matinal/Descargas/nombres_mujer.txt");
		//stream elegido FileReader
		FileReader in =null;
		try {
			in = new FileReader(inFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//lectura del mismo
		int c;
		try {
			while((c = in.read())!=-1)
				System.out.println((char)c);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
