package Diapositivas;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringBufferInputStream;

public class InputStreamBasico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = "esto es una frase";
		//convertimos el string a un flujo de bytes
		StringBufferInputStream in = new StringBufferInputStream(frase);
		int c;
		/*System.out.println(c);
		System.out.println((char)c);*/
		while((c = in.read())!=-1){
			System.out.println(c+" "+(char)c);
			

		}
		System.out.println("----------------------------------");
		try {
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String frase2 = "estoñ es una frase";
		byte [] arrayBytes = frase2.getBytes();
		System.out.println(arrayBytes[0]+" "+(char)arrayBytes[0]);
		ByteArrayInputStream in2 = new ByteArrayInputStream(arrayBytes,2,arrayBytes.length);
		while((c = in2.read())!=-1){
			System.out.println(c+" "+(char)c);
		}
		System.out.println("-----------------------");
		try {
			in2.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
