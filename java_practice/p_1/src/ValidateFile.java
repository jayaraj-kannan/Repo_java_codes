import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ValidateFile {
public static void main(String[] args) {
	System.out.println("###Validate Script started###");
	String inputFile="E:\\work_dsk\\Projects\\SIKORSKY\\Document\\input\\schema_v2.txt";
	validateFiles(inputFile);
	System.out.println("###Validate Script End###");
}

private static void validateFiles(String inputFile) {
	try {
		String timeStamp=new SimpleDateFormat("dd_MM_yy_hh_mm").format(new Date());
		PrintWriter writer = new PrintWriter("E:\\work_dsk\\Projects\\SIKORSKY\\Document\\log\\validateFile_"+timeStamp+".txt", "UTF-8");
		 try {
			List<String> filesPath= Files.readAllLines(Paths.get(inputFile));
			 for (String st : filesPath) {
				 if(!st.isEmpty() && st != null && st !="") {
					 //File currentfile=new File("E:\\work_dsk\\Projects\\SIKORSKY\\Dump\\sikorsky_21x\\output backup\\ResolvedConflicts\\"+st);
					File currentfile=new File("\\\\pu2vwballaero03\\d$\\EI_CodeMerge\\environment\\ENV002_R2021x\\OutPut\\ResolvedConflicts\\"+st);
					System.out.println("File :"+currentfile.getName());
					 if(currentfile.isFile()) {
						 System.out.println("------------* File exist");
						 writer.println(st+",Resolved");
					 }else {
						 writer.println(st+",NotResolved");
						 System.err.println("------------* File not exist");
					 }
				 }
				 }
			 
	} catch (Exception e) {
		e.printStackTrace();
		System.err.println("Error: "+e.getMessage());
	}
	writer.flush();
	writer.close();
}catch (Exception e) {
	e.printStackTrace();
}
}
}
