package Phase1.Round_2.Assisted_Practice.File_Handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// ---------------------------      update a file   ----------------------
public class UpdateFile {
    static Scanner sc = new Scanner(System.in);
    String path = "Phase1\\Round_2\\Assisted_Practice\\File_Handling\\";
    
    public void update() {
		System.out.print("\nEnter the file name for update... :  ");
		String fileName = sc.next();
		String filePath = path + fileName;
		File fl = new File(filePath);		// create for used file exist or not....

		if(fl.exists())
		{
			FileWriter f = null;			// FileWriter is used to writing in a file...
			try {
				f = new FileWriter(filePath, true);		// it will create a new file..if given file not exist..
				System.out.print("Enter the information : ");
				String data = sc.next();
				data += sc.nextLine();
				f.write(data);
	
				System.out.println("\n> file updated successfully...\n");
	
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					f.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}else
		{
			System.out.println("> OOps! this \'"+fl.getName()+"\' file is not present in the directory...");
		}
	}
    public static void main(String[] args) {
        UpdateFile f = new UpdateFile();
        f.update();
    }
}
