package javalab2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadfromFile {
    public static void main(String[] args) {
        try{
            File obj = new File("Table.txt");
            Scanner reader = new Scanner(obj);
            while (reader.hasNextLine()){
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();

        } catch (Exception e) {
            System.out.println("An error ocurred.");
            e.printStackTrace();
        }
    }
}
