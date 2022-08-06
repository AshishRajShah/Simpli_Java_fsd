
import java.io.File;
import java.util.Scanner;

public class SearchFile {
	Scanner sc = new Scanner(System.in);

	public void searchFile() {
		String path = "Phase1\\Virtual Key for ur Repositories\\";
		DisplayFile df = new DisplayFile();
		df.displayList();// call displayList() from the DisplayFile Class..

		System.out.print("Enter the file name  for search.. : ");
		String fileName = sc.next();
		String filePath = path + fileName;// complete path with file name...

		File f = new File(filePath);
		File fl = new File(path);
		File[] files = fl.listFiles(); // keep all files and dir. to files array..

		int flag = 0;
		for (File ff : files) {
			if (ff.getName().equals(f.getName())) {
				flag = 1;
				break;
			} else
				flag = 0;
		}
		if (flag == 1)
			System.out.println("your file \'" + f.getName() + "\' found...");
		else
			System.out.println(" - File not found... ");

	}
}
