

import java.io.File;
import java.util.Scanner;

public class DeleteFile {
	String path = "Phase1\\File Project\\";
	
	public void deleteFile(){
		DisplayFile df = new DisplayFile();
		df.displayList();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the file name for delete... :  ");
		String fileName = sc.next();
		String filePath = path + fileName;

		File f = new File(filePath);

		if (f.delete()) // created new value....
		{
			System.out.println("file deleted successfully...");

		} else {
			System.out.println("file not found....");
		}
		sc.close();
	}
}
