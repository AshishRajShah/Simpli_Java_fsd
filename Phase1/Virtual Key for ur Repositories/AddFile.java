
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AddFile {
	String path = "Phase1\\Virtual Key for ur Repositories\\";
	Scanner sc = new Scanner(System.in);

	public void createFile() {
		System.out.print("Enter the file name for create... :  ");
		String fileName = sc.next();
		String filePath = path + fileName; // complete path with file name...

		File f = new File(filePath);
		try {
			if (f.createNewFile()) // created new value....
			{
				System.out.println("file created successfully...\n");
			} else {
				System.out.println("file not created! already Exist....");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
