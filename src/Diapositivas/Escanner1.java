package Diapositivas;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Escanner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//vamos a leer un archivo
		File inFile = new File("/home/matinal/prueba");
		try (Scanner in = new Scanner(inFile,"UTF-8");){//indicamos el tipo de codificacion del archivo
			String valorLeido;
			while(in.hasNext()){
				valorLeido = in.next();
				System.out.println(valorLeido);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
