// Java Program to Copy file using File Stream

// Importing input output classes
import java.io.*;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

// Main Class
public class CopyFile {

	// Main driver method
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{

		// Creating two stream
		// one input and other output
		FileInputStream fis = null;
		FileOutputStream fos = null;

		// Try block to check for exceptions
		try {
			 boolean append = true;
			 PrintWriter writer = new PrintWriter("D:\\EI_CodeMerge\\Logs\\copyfiletrack_newwebstack.txt", "UTF-8");
			 File file = new File("D:\\EI_CodeMerge\\Logs\\webstack_webappsInput.txt");
			 BufferedReader br
	            = new BufferedReader(new FileReader(file));
			// Initializing both the streams with
			// respective file directory on local machine
			
			 String st;
			 try {
				 while ((st = br.readLine().trim()) != null ) {
					 if(!st.isEmpty() && st != null && st !="") {
						 System.out.println("Line string: "+st);
				// Custom directory path on local machine
					 File inputFile=null;
					 String fileFrom=null;
					 File current21x=new File("D:\\EI_CodeMerge\\environment\\ENV002_R2021x\\Input\\Current\\"+st);
					 File base22x=new File("D:\\EI_CodeMerge\\environment\\ENV001_R2022x\\Input\\Baseline\\"+st);
					 if(base22x.isFile()) {
						 inputFile=base22x;
						 fileFrom="22xbase";
					 }else if(current21x.isFile()) {
						 inputFile=current21x;
						 fileFrom="21xcurrent";
					 }
					 String fName=inputFile.getName();
					 System.out.println("File name: "+fName);
					 if(inputFile.isFile()) {
				fis = new FileInputStream(inputFile);

				// Custom directory path on local machine
				fos = new FileOutputStream(
					"D:\\EI_CodeMerge\\environment\\ENV002_R2021x\\OutPut\\ResolvedConflicts\\"+st);

				int c;

				// Condition check
				// Reading the input file till there is input
				// present
				while ((c = fis.read()) != -1) {

					// Writing to output file of the specified
					// directory
					fos.write(c);
				}

				// By now writing to the file has ended, so

				// Display message on the console
					System.out.println("copied the file successfully");
					writer.println(st+","+fileFrom+",completed");
				 }else {
					 writer.println(st+","+fileFrom+",error");
				 }
					
				 }
				 }
				 writer.flush();
				 writer.close();
			} catch (Exception e) {
				 writer.flush();
				 writer.close();
			}
			 fis.close();
			 fos.close();
		}catch(Exception e){
			e.printStackTrace();
		}

		
	}
}
