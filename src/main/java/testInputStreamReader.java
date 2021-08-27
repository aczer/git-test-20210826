import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
public class testInputStreamReader {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("D:/README.TXT"); // FileInputStream extends InputStream
            InputStreamReader isr = new InputStreamReader(fis);         // InputStreamReader extends Reader
            BufferedReader br = new BufferedReader(isr);				// BufferedReader extends Reader

            String s = null;
            while ((s = br.readLine()) != null) {
                System.out.println(s+"!!!!!!!");
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
