package Ejercicios;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejericicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Localidad> lista = new ArrayList<Localidad>();
		File inFile = new File("/home/luis/geografia.csv");
		File out = new File("/home/luis/geografia2.dat");
		try (Scanner sc = new Scanner(inFile); 
			ObjectOutputStream out2 = new ObjectOutputStream(new FileOutputStream(out))){
			sc.useDelimiter("\\s* \\s*");
			String id = sc.next();
			String latitude = sc.next();
			String longitude = sc.next();
			String elevation = sc.next();
			String name = sc.next();
			String url = sc.next();
			String year = sc.next();
			Localidad localidad = new Localidad(id, latitude, longitude, elevation, name, url, year);
			lista.add(localidad);
			out2.writeObject(lista);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
		System.out.println(lista);
	}
	
}
class Localidad implements Serializable{
	private String id;
	private String latitude;
	private String longitude;
	private String elevation;
	private String name;
	private String url;
	private String year;
	
	public Localidad(String id, String latitude, String longitude, String elevation,
			String name, String url, String year) {
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