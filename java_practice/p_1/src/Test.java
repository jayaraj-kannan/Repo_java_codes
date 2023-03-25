// Java program to take an integer
// as input and print it

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;import javax.xml.crypto.Data;

class Test {
	public static void main(String[] args)
	{
		Date d=new Date();
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH.mm.ssssss");
		System.out.println(dateFormat.format(d));
	}
}
