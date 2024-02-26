package input_output;

import java.io.*;

public class Exercise15_1 {
    public static void main(String[] args) throws Exception {
        try {
            int line = Integer.parseInt(args[0]);
            String fileName = args[1];

            FileReader fr = new FileReader("input_output/" + fileName);
            BufferedReader br = new BufferedReader(fr);

            for (int i = 1; i <= line; i++) {
                System.out.println(i + ":" + br.readLine());
            }

            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
