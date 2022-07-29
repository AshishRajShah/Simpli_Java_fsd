package Phase1.Round_2.Assisted_Practice.File_Handling;

import java.io.File;
// ---------------------------      Delete a file   ----------------------
public class deleteFile {

    public static void main(String[] args) {
        String path = "Phase1\\Round_2\\Assisted_Practice\\File_Handling\\fileclass.txt";

        File f = new File(path);        // create File obj....
        
        if(f.delete())                  // delete method gives boolean value...
        {
           System.out.println(f.getName()+" file has been deleted...");
        }
        else
            System.out.println("file not exist....");
    }
    
}
