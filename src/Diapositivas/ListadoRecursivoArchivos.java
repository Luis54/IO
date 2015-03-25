package Diapositivas;

import java.io.File;

public class ListadoRecursivoArchivos {
	public static void main(String[] args) {
		long inicio = System.nanoTime();
		if(args.length == 0){
		System.out.println("No hay argumentos");
		System.exit(1);		
		}
		File fichero = new File(args[0]);
		if(fichero.isDirectory()){
		listarArchivosResusivamente(fichero);
		}
		else
			System.out.println(fichero.getAbsolutePath());
		long fin = System.nanoTime();
		System.out.println("Tiempo de ejecucion a sido "+(fin-inicio)/1_000_000+" ms");
	}
	public static void listarArchivosResusivamente(File dir){
			File[] items = dir.listFiles();
			for (File file : items) {
				if(file.isDirectory()){
				listarArchivosResusivamente(file);
				System.out.println(file.getAbsolutePath());
			}
				
		}
		
	}
}
