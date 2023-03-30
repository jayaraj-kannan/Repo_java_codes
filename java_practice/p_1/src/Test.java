// Java program to take an integer
// as input and print it

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.stream.IntStream;

import javax.xml.crypto.Data;

class Test {
	public static void main(String[] args)
	{
		 int start = 0;
	        int end = 100;
	        int steps = 5;
		int temp=end/2;
		double res=0;
		//for(l=l;l<n;l++) {
		//	res=d+res/2;
		//	System.out.println(res);
		//}
		IntStream.range(start, steps)
			.mapToDouble(s-> res=temp+res/2)
			.
		System.out.println(Math.round(res));
	}
}
