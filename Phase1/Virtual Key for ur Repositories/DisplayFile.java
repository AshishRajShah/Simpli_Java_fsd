import java.io.File;
import java.util.Arrays;

public class DisplayFile {

	// Display file(ascending order)....
	public void displayList() {
		String path = "Phase1\\Virtual Key for ur Repositories";
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

}
