import java.io.*;

public class ThrowsExample {
    public static void readFile() throws IOException {
        FileReader file = new FileReader("test.txt");
        BufferedReader fileInput = new BufferedReader(file);
        System.out.println(fileInput.readLine());
        fileInput.close();
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("Error: File not found!");
        }
    }
}
