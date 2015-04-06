package Ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Libro> lista = new ArrayList<Libro>();
		//creamos el descriptor del fiochero
		File inFile = new File("/home/matinal/libros.csv");
		//creamos el flujo de entrada
		try (BufferedReader in = new BufferedReader(new FileReader(inFile));){
			String linea=in.readLine();//leo primera linea y la desecho
			Libro libro; //creo la referencia
			while((linea=in.readLine())!=null){
				String[] campo = linea.split(";");
				libro = new Libro(campo[0],campo[3], campo[6]);
				lista.add(libro);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
class Libro{
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