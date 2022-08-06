import java.io.IOException;
import java.util.Scanner;

public class ProjectMain {
	public static void main(String[] args) throws IOException {
		// all classes object creation...
		SearchFile sf = new SearchFile();
		DeleteFile df = new DeleteFile();
		AddFile af = new AddFile();
		DisplayFile dsf = new DisplayFile();
		Scanner sc = new Scanner(System.in);

		// infinite while loop used to iterate until user want to run...
		label: while (true) {
			System.out.println("\t----------------------------\t\tVirtual Key Repositories\t------------------------");
			System.out.println("												Developer : Akshay Raj");
			System.out.print(
					"\n> Press '1' to see your file...\n> Press '2' to do operation on file...\n> Press '3' to Exit...\n\n** Input :");
			int choice = sc.nextInt();
			switch (choice) {
				case 1:
					dsf.displayList(); // display the file....
					break;
				case 2:
					while (true) {
						System.out.println(">  -----------------    Operations Option     -------------------");
						System.out.print(
								" - 1. Add File...\n - 2. Search File...\n - 3. Delete File...\n - 4. Back to Menu...\n** Input : ");
						int opt = sc.nextInt();
						System.out.println();
						switch (opt) {
							case 1:
								af.createFile();// Add file...
								break;
							case 2:
								sf.searchFile();// Search file...
								break;
							case 3:
								df.deleteFile();// Delete file...
								break;
							case 4:
								continue label; // label used to go to back menu...
							default:
								System.out.println("OOps! Invalid option..Plz choose again..");
								break;
						}
					}
				case 3:
					sc.close();
					System.exit(0);
				default:
					System.out.println("OOps! Invalid option..Plz choose again..");
					break;
			}
		}
	}
}
