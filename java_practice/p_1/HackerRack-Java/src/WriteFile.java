import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;


public class WriteFile {
public static void main(String[] args) {
	System.out.println("###Write File Script started###");
	//String inputFile="E:\\work_dsk\\Projects\\SIKORSKY\\Document\\input\\filename.txt";
	String inputFile="E:\\work_dsk\\Projects\\SIKORSKY\\Document\\input\\filename_1.txt";
	String targetFile="E:\\work_dsk\\Projects\\SIKORSKY\\Dump\\3dspace_script\\spinner\\Business\\SpinnerProgramData_ALL.xls";
	//validateFiles(inputFile);
	//getFilepath(inputFile);
	getDataFromFileBySting(inputFile,targetFile);
	System.out.println("###Write File Script Script End###");
}

private static void getFilepath(String inputFile) {
	System.out.println("###Starting script ####");
	try {
		String timeStamp=new SimpleDateFormat("dd_MM_yy_hh_mm").format(new Date());
		PrintWriter writer = new PrintWriter("E:\\work_dsk\\Projects\\SIKORSKY\\Document\\input\\filename_1.txt");
		 try {
			 List<File> fileList=new ArrayList<>();
			 fileList= getFileListFromDir(inputFile,fileList);
			 
			 for (int i = 0; i < fileList.size(); i++) {
				 String fileName=fileList.get(i).getName().replaceAll("_mxJPO.java", "").trim();
			     writer.print(fileName+"\n");
			 }
			 
	} catch (Exception e) {
		e.printStackTrace();
		System.err.println("Error: "+e.getMessage());
	}
	writer.flush();
	writer.close();

		
	} catch (Exception e) {
		e.printStackTrace();
	}
	System.out.println("###End script ####");
}

private static void getDataFromFileBySting(String inputFile,String targetFile) {
	System.out.println("#### Starting script getDataFromFileBySting ####");
	try{
		String timeStamp=new SimpleDateFormat("dd_MM_yy_hh_mm").format(new Date());
	PrintWriter writer = new PrintWriter("E:\\work_dsk\\Projects\\SIKORSKY\\Document\\input\\program_data_2.txt");
	 try {
		List<String> inputLineList= Files.readAllLines(Paths.get(inputFile));
		List<String> tragetLineList= Files.readAllLines(Paths.get(targetFile));
		for (int i = 0; i < inputLineList.size(); i++) {
			String inputLine=inputLineList.get(i).trim();
			boolean flag =false;
			for (int j = 0; j < tragetLineList.size(); j++) {
				String targetLine=tragetLineList.get(j).trim();
				if(!flag) {
				if(targetLine.contains(inputLine)) {
					writer.print(targetLine+"\n");
					flag=true;
				}else {
					flag=false;
				}
				}else {
					break;
				}
				if(tragetLineList.size() == tragetLineList.size()-1 && !flag) {
					writer.print(inputLine+"\n");
				}
			}
		}
			 
	} catch (Exception e) {
		e.printStackTrace();
		System.err.println("Error: "+e.getMessage());
	}
	writer.flush();
	writer.close();

		
	} catch (Exception e) {
		e.printStackTrace();
	}
	System.out.println("#### End script getDataFromFileBySting ####");
}

private static List<File> getFileListFromDir(String targetFile,List<File> fileList) {
	File dir=new File(targetFile);
	File[] fList=dir.listFiles();
	if(fList !=null) {
		for (File file : fList) {
			if(file.isFile()) {
				System.out.println("fileList: "+fileList);
				fileList.add(file);
			}else if(file.isDirectory()) {
				getFileListFromDir(file.getAbsolutePath(),fileList);
			}
		}
	}
	return fileList;
}

private static void validateFiles(String inputFile) {
	try {
		String timeStamp=new SimpleDateFormat("dd_MM_yy_hh_mm").format(new Date());
		PrintWriter writer = new PrintWriter("E:\\work_dsk\\Projects\\SIKORSKY\\Document\\input\\delete_attr1.mql");
		 try {
			List<String> filesPath= Files.readAllLines(Paths.get(inputFile));
			 for (String st : filesPath) {
				 if(!st.isEmpty() && st != null && st !="") {
					writer.print("del attr "+st+";");
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
