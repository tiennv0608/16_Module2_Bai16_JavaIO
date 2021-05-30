import java.io.*;

public class FilterOutputStreamExample {
    public static void main(String[] args) throws IOException {
        int inChar;
        System.out.println("Enter a Character:");
        try {
            inChar = System.in.read();
            System.out.print("You entered ");
            System.out.println(inChar);
        }
        catch (IOException e){
            System.out.println("Error reading from user");
        }
    }
}