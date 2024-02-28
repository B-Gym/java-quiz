package input_output;

import java.io.*;

public class Exercise15_4 {

    public static void main(String[] args) throws IOException {
        String path = "input_output/FileMerge";
        String newFileName = "result.txt";

        File dir = new File(path);
        File[] list = dir.listFiles();

        for (int i = 0; i < list.length; i++) {
            FileReader fr = new FileReader(list[i]);
            BufferedReader br = new BufferedReader(fr);

            FileWriter fw = new FileWriter("input_output/" + newFileName, true);
            BufferedWriter bw = new BufferedWriter(fw);

            String data = "";

            while ((data = br.readLine()) != null) {
                bw.write(data + "\n");
            }

            br.close();
            bw.close();
        }

    }
}
