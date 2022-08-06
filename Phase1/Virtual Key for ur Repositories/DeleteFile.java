import java.io.File;
import java.util.Scanner;

public class DeleteFile {
	String path = "Phase1\\Virtual Key for ur Repositories\\";
	Scanner sc = new Scanner(System.in);
	
	public void deleteFile(){
		DisplayFile df = new DisplayFile();
		df.displayList();
		
		System.out.print("\nEnter the file name for delete... :  ");
		String fileName = sc.next();
		String filePath = path + fileName;// complete path with file name...

		File f = new File(filePath);

		if (f.delete()) //  return boolean value if file deleted..
		{
			System.out.println("file deleted successfully...");

		} else {
			System.out.println("file not found....");
		}
		
	}
}