package Diapositivas;

import java.io.File;
import java.io.FilenameFilter;

public class FicheroFiltrados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length == 0){
			System.out.println("No hay argumentos");
			System.exit(1);		
		}
		//creamos el objeto fili
		File directorio = new File(args[0]);
		//si es un directorio,hacemos un filtro de archivos
		if (directorio.isDirectory()) {
			String [] list = directorio.list(new FilenameFilter() {
				
				@Override
				public boolean accept(File directorio, String name) {
					// TODO Auto-generated method stub
					return name.endsWith(".java") || name.endsWith(".class") ;
				}
			});//clase interna anonima de FilenameFilter
			//hay que sobrescribir el metodo accept
			//imprimimos los valores
			for (String string : list) {
				System.out.println("Nombre del archivo: "+string);
			}
			/*for (int i = 0; i < list.length; i++) {
				System.out.println("Nombre del archivo: "+list[i]);
			}*/
		}
	}

}
