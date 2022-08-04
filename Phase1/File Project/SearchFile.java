
import java.io.File;
import java.util.Scanner;

public class SearchFile {

	public void searchFile() {
		String path = "Phase1\\File Project\\";
		DisplayFile df = new DisplayFile();
		Scanner sc = new Scanner(System.in);
		df.displayList();
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
			System.out.println("your file \'" + f.getName() + "\' found...");
		else
			System.out.println(" - File not found... ");

		sc.close();
	}
}
