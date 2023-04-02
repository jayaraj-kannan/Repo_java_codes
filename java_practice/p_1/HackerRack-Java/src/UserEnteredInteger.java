import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserEnteredInteger {
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Please enter a input: ");
            String number = br.readLine();
            System.out.println(number);
        } catch (IOException ex) {
            System.out.println(ex);
        } finally {
            System.out.println("User can enter anything, this is not a valid program");
            System.out.println("#######################################################");
            
        }
        int number2;
        
        try { // try with resources, close automatically
        	Scanner input = new Scanner(System.in);
            System.out.print("Please enter a number: ");
          number2 = input.nextInt();
            
                System.out.println("User entered: " + number2);
           
        } catch (Exception ex){
            System.out.println(ex);
        } finally {
            System.out.println("User can enter only numbers, this is a valid program");
            System.out.println("#######################################################");
        }
    }
}