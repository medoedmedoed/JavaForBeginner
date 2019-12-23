import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        String s;
        try (BufferedReader br = new BufferedReader(new FileReader("D://IntelliJProjects//GIT//JavaForBeginner//src//example.txt"))){
            while ((s = br.readLine())!= null ) {
                System.out.print(s);
            }
        }
        catch (IOException exc) {
            System.out.println("Error in-output: " + exc);
        }
    }
}
