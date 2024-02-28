package input_output;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Exercise15_2 {
    public static void main(String[] args) {

        try {
            File f = new File("input_output/binary.txt");

            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            String data = "";

            while ((data = br.readLine()) != null) {
                String hexa = Integer.toHexString(Integer.parseInt(data, 2));
                System.out.println(hexa.toUpperCase());
            }

            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
