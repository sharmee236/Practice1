package coreJava;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalanderDemo {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sd = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		System.out.println(sd.format(cal.getTime()));
		
		
		

	}

}
