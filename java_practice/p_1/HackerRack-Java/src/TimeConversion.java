import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;


import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class TimeConversionResult {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s)  {
    	SimpleDateFormat inputFormat = new SimpleDateFormat("hh:mm:ssa");
    	SimpleDateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");
    	Date date=null;
		try {
			date = inputFormat.parse(s);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return outputFormat.format(date);

    }

}

public class TimeConversion {
    public static void main(String[] args) throws Exception {
       
        String result = TimeConversionResult.timeConversion("07:05:45PM");
        System.out.println(result);
     
    }
}
