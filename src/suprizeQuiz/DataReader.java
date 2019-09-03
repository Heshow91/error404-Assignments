package suprizeQuiz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {
    public static void main(String[] args) throws IOException {

        String text;
        String h = null;

        try {
            FileReader fileReader = new FileReader("/Users/heshow/Desktop/JavaQuizes/src/error404/somthing.txt");

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((text = bufferedReader.readLine()) != null) {
                h = text;
            }
            fileReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(h);
    }
}