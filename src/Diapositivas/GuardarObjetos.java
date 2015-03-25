package Diapositivas;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GuardarObjetos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Persona> lista = new ArrayList<Persona>();
		Persona p1 = new Persona("Luis", 21);
		lista.add(p1);
		Persona p2 = new Persona("Nerea", 20);
		lista.add(p2);
		Persona p3 = new Persona("Oscar", 2);
		lista.add(p3);
		Persona p4 = new Persona("Merche", 31);
		lista.add(p4);
		Persona p5 = new Persona("Laura", 32);
		lista.add(p5);
		
		//vamos a guardar esa lista en un fichero
		//primeros creamos un objeto ObjectOutputStream 
		try (ObjectOutputStream out1 = new ObjectOutputStream(new FileOutputStream(new File("/home/matinal/objeto.dat")));){
			out1.writeObject(lista);
			out1.flush();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		try (ObjectInputStream in = new ObjectInputStream (new FileInputStream(new File("/home/matinal/objeto.dat")));){
			List<Persona> listaNueva  =(List<Persona>) in.readObject();
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("Lista correctamente guardada");
		
	}


}
class Persona implements Serializable{
	private String nombre;
	private int edad;
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
}