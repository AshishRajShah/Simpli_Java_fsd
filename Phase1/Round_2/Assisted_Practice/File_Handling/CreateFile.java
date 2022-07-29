package Phase1.Round_2.Assisted_Practice.File_Handling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
// ---------------------------      Create a file   ----------------------
public class CreateFile {
    String path = "Phase1\\Round_2\\Assisted_Practice\\File_Handling\\fileclass.txt";

    // --------- by using file class.....
    public void fileClass() {
        File f = new File(path);

        try (Scanner sc = new Scanner(System.in)) {
            if (f.createNewFile()) // it creates file if they r already not exist..
            {
                System.out.println("Your file " + f.getName() + " is succesfully created...");
                try // create for FileWriter exception handling....
                {
                    FileWriter w = new FileWriter(f); // used to write a file..
                    System.out.print("Enter the content : ");
                    String text = sc.nextLine();

                    w.write(text);
                    w.close();
                    System.out.println("\n - data successfully written in " + f.getName() + "....");

                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else
                System.out.println("file exist already...");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void fileOutputStream() {
        FileOutputStream f = null;
        try (Scanner sc = new Scanner(System.in)) {
            f = new FileOutputStream(path); // file created...
            
            System.out.print("Enter the content : ");
            String text = sc.nextLine();

            byte[] str = text.getBytes();       // convert string to byte...
            f.write(str);                       // in FOS we don't need to create FileWriter obj...
            f.close();
            System.out.println("\n - data successfully written....");

        } catch (IOException e) {
            e.printStackTrace();
        }finally
        {
            try {
                f.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
    }

    public void fileNIO()       // it will throw error 
    {
        try {
            
            Path pathLocation = Paths.get(path);
            Path p = Files.createFile(pathLocation);        // for this we handled exception..
            System.out.println("File is created at : "+p);
            
        } catch (Exception e) {
            System.out.println("Error : ");
            e.printStackTrace();
        }

        // for write use FileWriter....
    }

    public static void main(String[] args) {
        CreateFile cf = new CreateFile();
        cf.fileClass();
        cf.fileOutputStream();
        cf.fileNIO();
    }

}
