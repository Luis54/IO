package Diapositivas;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopiarFicheroSinBuffer {
	public static void main(String[] args) {
		//originamos los File de entra y salida
		File inFile = new File("/home/matinal/Descargas/Prueba");
		File outFile = new File("/home/matinal/Descargas/Prueba2");
		//stream elegimos son FileInputStream y FileOutStream
		///lo definimos como variables "globales" para tener acceso desde cualquier
		//bloque
		FileInputStream in = null; //para posteriormente comprabar que es |=null
		FileOutputStream out = null;
		//inicializamos los dos stream
		try {
			in = new FileInputStream(inFile);
			out = new FileOutputStream(outFile);
			//controlamos el tiempo
			long inicio = System.nanoTime();
			//procedemos a la lectura del inputStream
			int c;//recogemos los byte uno a uno
			//hasta encontrar -1 que es fin del stream
			while((c=in.read())!=-1)
				//lo leido del inputStream lo llevamos a OutputStream
				out.write(c);
			long fin = System.nanoTime();
			System.out.println("Fichero copiado en: "+(fin-inicio)/1_000_000 +"ms");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//cerramos los stream
		finally{
			if (in!=null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(out !=null)
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}
	
	
}
