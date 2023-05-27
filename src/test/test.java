package test;
import org.sqlite.JDBC;
import java.io.File;
import java.util.Date;

import connect.Connect;

public class test {
	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println(new Date());
		
		String filePath = "src/connect/database/database.db";
        File file = new File(filePath);
        
        if (file.exists()) {
            System.out.println("El archivo existe en la ubicación especificada.");
        } else {
            System.out.println("El archivo no existe en la ubicación especificada.");
        }
        
		Connect.connect2();
	}
}
