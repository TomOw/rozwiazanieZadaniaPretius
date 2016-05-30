import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Tomasz on 30.05.2016.
 */
public class main {
    public static void main(String[] args) {
        Scanner in = null;
        try {
            in = new Scanner(new File(args[0]));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        double result = 0;
        if (in != null) {
            while (in.hasNext()) {
                String line = in.nextLine();
                if (line.length() > 0) {
                    String valueString = line.split(":")[5];
                    valueString = valueString.replace(",", ".");
                    valueString = valueString.substring(0, valueString.length() - 3);
                    result += Double.parseDouble(valueString);
                    System.out.println(result);
                }
            }
        }
    }
}