package coreJava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		//print current date/ time
		
		Date d = new Date();
		System.out.println(d.toString());
		
		//format mm/dd/yyyy HH:MM:SS
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/d/yyyy HH:mm:SS");
		System.out.println(sdf.format(d));
		
		//www.tutorialspoint.com/java/java_date_time.htm
		
		

	}

}
