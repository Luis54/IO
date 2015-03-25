package Diapositivas;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LeerFicheroConFormato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//fichero de entrada:
		File inFile = new File("/home/matinal/Descargas/nombres_mujer.txt");
		File outFile = new File("/home/matinal/Descargas/nombres_mujer.txt");
		//stream elegido : Data InputStream porque contiene datos con formato
		DataInputStream in = null;
		//abrimos el Stringo usamos Buffer
		try {
			in = new DataInputStream(new BufferedInputStream(new FileInputStream(inFile)));
			//leemos string
			String leido;
			while((leido=in.readLine())!=null)//no se usa porque tenemos clases de stream pra character
				System.out.println(leido);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if (in !=null) {
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
