import java.io.*;

public class ReadWriteFile {
    public static void main(String[] args) {
        String s;
       int l = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("D://IntelliJProjects//GIT//JavaForBeginner//src//example.txt"))) {
            while ((s = br.readLine()) != null) {
                l++;
                System.out.println(s);
            }
        } catch (IOException exc) {
            System.out.println("Error in-output: " + exc);
        }
        System.out.println("\n" + l);

        String str;
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
        try (FileWriter fw = new FileWriter("D://IntelliJProjects//GIT//JavaForBeginner//src//example.txt")) {
            for (int i = 0; i < l; i++) {
                str = bufr.readLine();
                str = str + "\n";
                fw.write(str);
            }
        }
        catch (IOException exc) {
            System.out.println("Error : " + exc);
        }
    }
}
