import java.io.*;

public class WriteFile {
    public static void main(String[] args) {
        String s;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter 'stop' to end the input");
        try (FileWriter fw = new FileWriter("test.txt")) {
            do {
                s = br.readLine();
                if (s.compareTo("stop") == 0) break;
                s = s + "\n";
                fw.write(s);
            } while (s.compareTo("stop") != 0);
        }
            catch (IOException exc) {
                System.out.println("Error : " + exc);
            }
    }
}
