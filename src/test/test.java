package test;
//import org.sqlite.JDBC;
import java.io.File;
import java.util.Date;

import connect.Connect;
import models.Category;
import models.Restaurant;

public class test {
	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println(new Date());
		Restaurant restaurant = new Restaurant();
		
		System.out.println( restaurant.login("cesarc", "12345678"));
		System.out.println( Category.valueOf("SALARY").getCategoryName());
		System.out.println( restaurant.payExpense(Category.valueOf("SALARY"),"Salario Gerente",(float) 1200000));
	}
}
