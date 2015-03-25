package Diapositivas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EjemploFileReaderBuffe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//solo para archvo de texto
		File inFile = new File("/home/matinal/Descargas/nombres_mujer.txt");
		File onFile = new File("/home/matinal/Descargas/nombres_mujer_copiado.txt");
		//stream elegido FileReader
		BufferedReader in =null;
		BufferedWriter out =null;
		try {
			in = new BufferedReader(new FileReader(inFile));
			try {
				out = new BufferedWriter(new FileWriter(onFile));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//lectura del mismo
		int c;
		try {
			while((c = in.read())!=-1)
				out.write(c);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if (in != null) {
				try {
					in.close();
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
