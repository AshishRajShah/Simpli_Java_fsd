import java.util.Scanner;

public class ProjectMain  {
	public static void main(String[] args) {
		SearchFile sf = new SearchFile();
		DeleteFile df = new DeleteFile();
		AddFile af = new AddFile();
		DisplayFile dsf = new DisplayFile();
		Scanner sc = new Scanner(System.in);


	label:while (true) {
		System.out.println("------------------------     File Management Project   ---------------------\n");
		System.out.print(
				"> Press '1' to see your file...\n> Press '2' to do operation on file...\n> Press '3' to Exit...\n\n- Input > ");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			dsf.displayList();
			break;
		case 2:
			 while (true) {
				System.out.println(">  Operations Option : ");
				System.out.print(
						" - 1. Add File...\n - 2. Search File...\n - 3. Delete File...\n - 4. Back to Menu...\n\n- Input > ");
				int opt = sc.nextInt();
				switch (opt) {
				case 1:
					af.createFile();
					break;
				case 2:
					sf.searchFile();
						break;
					case 3:
						df.deleteFile();
						break;
					case 4:
						continue label;
					default:
					System.out.println("OOps! Invalid option..Plz choose again..");
					}
			}
			case 3:
			sc.close();
			System.exit(0);
		default:
				System.out.println("OOps! Invalid option..Plz choose again..");
			}
		}
		
	}
}



