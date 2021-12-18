package javalab2;
import java.io.FileWriter;
import java.io.IOException;

public class WritetoFile {
    public static void main(String[] args) {
        try{
            FileWriter obj = new FileWriter("Table.txt");
            obj.write("java is the programming language");
            obj.close();
            System.out.println("successfully wrote to the file .");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
