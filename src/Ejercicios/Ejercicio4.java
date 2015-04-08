package Ejercicios;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Libro> lista = new ArrayList<Libro>();
		Set<Libro> listaDiezLibros = new HashSet<Libro>();
		//creamos el descriptor del fiochero
		File inFile = new File("/home/matinal/libros.csv");
		//creamos el flujo de entrada
		try (BufferedReader in = new BufferedReader(new FileReader(inFile));){
			String linea=in.readLine();//leo primera linea y la desecho
			Libro libros; //creo la referencia
			while((linea=in.readLine())!=null){
				String[] campo = linea.split(":");
				//libros = new Libro(campo[0],campo[3],campo[6]);
				//lista.add(libros);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//debemos sacar diez libros al azar y añadirlos a la nueva lista
		Libro libro;
		do{
			//posicion aleatoria
			int posicionLibroLista = (int) (Math.random()*lista.size());
			//obtenemos libros de la lista
			libro = lista.get(posicionLibroLista);
			//lo añadimos a la nueva lista
			listaDiezLibros.add(libro);
		}while(listaDiezLibros.size() <10);
		File outFile = new File("/home/matinal/libros.dat");
		try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(outFile)))){

			out.writeObject(listaDiezLibros);
		
			
		} catch (Exception e) {
			// TODO: handle exception
		}
}
class Libro implements Serializable{
	private String titulo;
	private String autor;
	private String isbn;
	
	public Libro(String titulo, String autor, String isbn) {
		this.titulo = titulo;
		if(autor.equals(""))
			this.autor = "desconocido";
		else
			this.autor =autor;
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", isbn="
				+ isbn + "]";
	}
	
	}	
}