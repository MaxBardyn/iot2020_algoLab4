package lab4;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class FileReaderAndWriter {


    public static Set<String> reader() {

        Set<String> listOfLines = new HashSet<>();
        try (var bufferedReader = new BufferedReader(new FileReader("wchain.in.txt"))) {
            bufferedReader.readLine();
            String line = bufferedReader.readLine();
            while (line != null) {
                listOfLines.add(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listOfLines;
    }

    public static void writer(Integer counter) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("wchain.out.txt"));) {
            writer.write(counter.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
