package Ejercicios;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Ejericicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Localidad> lista = new ArrayList<Localidad>();
		File inFile = new File("/home/matinal/geografia.csv");
		File out = new File("/home/matinal/geografia2.dat");
		try (Scanner sc = new Scanner(inFile).useDelimiter(","); 
			ObjectOutputStream out2 = new ObjectOutputStream(new FileOutputStream(out))){
			sc.nextLine();
			while(sc.hasNext()){
			String id = sc.next();
			double latitude = Double.parseDouble(sc.next());
			double longitude = Double.parseDouble(sc.next());
			int elevation = Integer.parseInt(sc.next());
			String name = sc.next();
			String url = sc.next();
			int year = Integer.parseInt(sc.next());
			Localidad localidad = new Localidad(id, latitude, longitude, elevation, name, url, year);
			lista.add(localidad);
			}
			sc.close();
			out2.writeObject(lista);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (NoSuchElementException e){
			System.out.println("Archivo Creado");
		}
	
	
	}
	
}
class Localidad implements Serializable{
	private String id;
	private double latitude;
	private double longitude;
	private int elevation;
	private String name;
	private String url;
	private int year;
	
	public Localidad(String id, double latitude, double longitude, int elevation,
			String name, String url, int year) {
		this.id = id;
		this.latitude = latitude;
		this.longitude = longitude;
		this.elevation = elevation;
		this.name = name;
		this.url = url;
		this.year = year;
	}
	

	@Override
	public String toString() {
		return "Localidad [id=" + id + ", latitude=" + latitude
				+ ", longitude=" + longitude + ", elevation=" + elevation
				+ ", name=" + name + ", url=" + url + ", year=" + year + "]";
	}
	
}