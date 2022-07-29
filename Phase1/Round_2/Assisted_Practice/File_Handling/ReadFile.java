package Phase1.Round_2.Assisted_Practice.File_Handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
// ---------------------------      Read a file   ----------------------
public class ReadFile {

    String path = "Phase1\\Round_2\\Assisted_Practice\\File_Handling\\fileclass.txt";

    public void scannerRead() 
    {
        try {
            File f = new File(path);    // by file class..
            Scanner Reader = new Scanner(f);        // here scanner take f as object...

            System.out.print("Reading data from file by Scanner...: \n >  ");
            while (Reader.hasNextLine()) {
                String data = Reader.nextLine();
                System.out.println(data);
            }
            Reader.close();             //close the Scanner Connection..

        } catch (IOException e) {
            System.out.println("unable to read file...");
            e.printStackTrace();
        }
    }

    public void fileReader() {
        try {

            FileReader r = new FileReader(path);
            int i = 0;
            try {
                System.out.print("Reading data from file by FileReader...: \n >  ");
                while ((i = r.read()) != -1) // here r.read() gives integer value..
                {
                    System.out.print((char) i); // here typecast the int to char..
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            System.out.println("unable to read the file....");
            e.printStackTrace();
        }

    }

    public void fileInputStream() 
    {
        FileInputStream fis = null;
        try{
            File f = new File(path);
            fis = new FileInputStream(f);

            // - Print the content....
            int i=0;
            System.out.print("\nReading data from file by FileInputStream...: \n >  ");
                while ((i = fis.read()) != -1) // here r.read() gives integer value..
                {
                    System.out.print((char) i); // here typecast the int to char..
                }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        finally{
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void bufferReader()
    {
        File f = new File(path);
    
        // bufferREader take input with FileReader...
        try(BufferedReader br = new BufferedReader(new FileReader(f)))  // it will automatically close 
        {                                                           // the  connection...
             // - Print the content....
             int i=0;
             System.out.print("\nReading data from file by BufferReader....: \n >  ");
                 while ((i = br.read()) != -1) // here r.read() gives integer value..
                 {
                     System.out.print((char) i); // here typecast the int to char..
                 }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void readNio()
    {
        try {       // readAllLines - NIO method..
           List<String> ls = Files.readAllLines(Paths.get(path)); // it returns list of string so used list..

            // - Print the content....
            Iterator<String> it = ls.iterator();

            System.out.print("\nReading data from file by NIO....: \n >  ");
                while (it.hasNext()) // here r.read() gives integer value..
                {
                    System.out.println(it.next()); // here typecast the int to char..
                }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        ReadFile rf = new ReadFile();
        rf.scannerRead();
        rf.fileReader();
        rf.fileInputStream();
        rf.bufferReader();
        rf.readNio();
    }

}
