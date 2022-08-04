package Phase1.Round_2.Assisted_Practice.File_Handling;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FileProject {
	String path = "Phase1\\Round_2\\Assisted_Practice\\File_Handling\\";
	static Scanner sc = new Scanner(System.in);

	// Display file(ascending order)....
	public void displayList() {
		File f = new File(path);
		File[] files = f.listFiles();
		
		// sorted in ascending order...
		Arrays.sort(files);

		// show...
		System.out.println(" >  Your files & directory in " + f.getName() + "'s are : \n");
		for (File ff : files) {
			System.out.println(" - " + ff.getName());
		}
		System.out.println();
	}

	// search a file...
	public void searchFile() {
		displayList();
		System.out.print("Enter the file name  for search.. : ");
		String fileName = sc.next();
		String filePath = path + fileName;
		File f = new File(filePath);
		File fl = new File(path);
		File[] files = fl.listFiles();

		int flag = 0;
		for (File ff : files) {
			if (ff.getName().equals(f.getName())) {
				flag = 1;
				break;
			} else
				flag = 0;
		}
		if (flag == 1)
			System.out.println("your file " + f.getName() + " found...");
		else
			System.out.println(" - File not found... ");
	}

	// Create a file...
	public void createFile() {
		System.out.print("Enter the file name for create... :  ");
		String fileName = sc.next();
		String filePath = path + fileName;

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

	// Delete a File....
	public void deleteFile() {
		displayList();
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

	}

	public void readFile()
	{
		displayList();
		System.out.print("\nEnter the file name to Read... :  ");
		String fileName = sc.next();
		String filePath = path + fileName;
		
		try {
			FileReader fr = new FileReader(filePath);
			int i = 0;
            try {
                System.out.print("Reading data from file...: \n >  ");
                while ((i = fr.read()) != -1) // here r.read() gives integer value..
                {
                    System.out.print((char) i); // here typeCast the int to char..
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {

		FileProject fp = new FileProject();

		System.out.println("---------        File Management Operatios..   -----------------\n");

		while (true) {
			System.out.println(
					"\n1. Add a file...\n2. Delete a file...\n3. Search a file....\n4. Read a file...\n5. show files...\n6. Exit");
			System.out.print("\nChoose the option from above content... ");
			int choice = sc.nextInt();
			System.out.println();

			switch (choice) {
			case 1:
				fp.createFile();
				System.out.println("\n-------------------------");
				break;
			case 2:
				fp.deleteFile();
				System.out.println("\n-------------------------");
				break;
			case 3:
				fp.searchFile();
				System.out.println("\n-------------------------");
				break;
			case 4:
				fp.readFile();
				System.out.println("\n-------------------------");
				break;
			case 5 :
				fp.displayList();
				break;
			case 6:
				System.exit(0);
			default:
				System.out.println("OOps! it seems u choose incorrect option..");
			}
		}
	}
}
