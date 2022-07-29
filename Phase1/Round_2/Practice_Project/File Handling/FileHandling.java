import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/* 
 *  -----------------------     File Handling  Project     --------------------
 */
public class FileHandling {
	String path = "Phase1\\Round_2\\Practice_Project\\File Handling\\";
	static Scanner sc = new Scanner(System.in);

	// Display file....
	public void displayList() {
		File f = new File(path);
		System.out.println();
		File[] files = f.listFiles();

		// sorted in ascending order...
		Arrays.sort(files);

		// show...
		System.out.println("* Your files in " + f.getName() + "'s are : \n");
		for (File ff : files) {
			System.out.println("- " + ff.getName());
		}
	}

	// Write a file...
	public void writeFile() {
		System.out.println(">	Write Operation in File....\n");
		System.out.print("Enter the file name... :  ");
		String fileName = sc.next();
		String filePath = path + fileName;
		File f = new File(filePath);

        try {
            if (f.createNewFile()) // it creates file if they r already not exist..
            {
                System.out.println("Your file " + f.getName() + " is succesfully created...");
                try // create for FileWriter exception handling....
                {
                    FileWriter w = new FileWriter(f); // used to write a file..
                    System.out.print("\nEnter the content : ");
                    String text = sc.next();
					text += sc.nextLine();

                    w.write(text);
                    w.close();
                    System.out.println("\n - data successfully written in " + f.getName() + "....");

                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else
			{
                System.out.println("This \'"+f.getName()+"\' is a existed file...");
				try // create for FileWriter exception handling....
                {
                    FileWriter w = new FileWriter(f); // used to write a file..
                    System.out.print("\nEnter the content : ");
                    String text = sc.next();
					text += sc.nextLine();

                    w.write(text);
                    w.close();
                    System.out.println("\n - data successfully written in " + f.getName() + "....");

                } catch (IOException e) {
                    e.printStackTrace();
                }
			}
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

	// Read a file...
	public void readFile() {
		System.out.println("\n>	Read Operation in File....");
		displayList();
		System.out.print("\nEnter the file name to Read... :  ");
		String fileName = sc.next();
		String filePath = path + fileName;
		File f = new File(filePath);

		if (f.exists()) {
			if (f.length() > 0) {
				try {
					FileReader fr = new FileReader(filePath);
					int i = 0;
					try {
						System.out.print("Reading data from file...: \n --  ");
						while ((i = fr.read()) != -1) // here r.read() gives integer value..
						{
							System.out.print((char) i); // here typeCast the int to char..
						}
						System.out.println();

					} catch (IOException e) {
						e.printStackTrace();
					}

				} catch (IOException e) {
					e.printStackTrace();
				}
			} else {
				System.out.println("-- Sorry! this is an empty file..");
			}

		} else {
			System.out.println("-- Oops! You choosed wrong file...");
		}
	}

	// Append in a file...
	public void appendInFile() {
		System.out.println("\n>	Append Operation in File....\n");
		System.out.print("Enter the file name for update... :  ");
		String fileName = sc.next();
		String filePath = path + fileName;
		File fl = new File(filePath); // create for used file exist or not....

		if (fl.exists()) {
			FileWriter f = null; // FileWriter is used to writing in a file...
			try {
				f = new FileWriter(filePath, true); // it will create a new file..if given file not exist..
				System.out.print("Enter the information : ");
				String data = sc.next();
				data += sc.nextLine();
				f.write(data);

				System.out.println("\n-- file updated successfully...\n");

			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					f.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} else {
			System.out.println("> OOps! this \'" + fl.getName() + "\' file is not present in the directory...");
		}
	}

	public static void main(String[] args) {

		FileHandling fh = new FileHandling();
		System.out.println("---------------		File Handling Management System...		------------\n");
		fh.writeFile();
		System.out.println("-------------------------------------------------------");
		fh.readFile();
		System.out.println("-------------------------------------------------------");
		fh.appendInFile();
	}
}