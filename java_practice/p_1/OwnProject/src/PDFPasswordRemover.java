import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;

public class PDFPasswordRemover {
	public static void main(String[] args)
		 throws IOException {
		
		// select a file for Decryption operation
		File file = new File("File path Location");

		// Load the PDF file
		PDDocument pdd = PDDocument.load(file, "PASSWORD");

		// removing all security from PDF file
		pdd.setAllSecurityToBeRemoved(true);

		// Save the PDF file
		pdd.save(file);

		// Close the PDF file
		pdd.close();
		System.out.println("Decryption Done...");
	}
}
