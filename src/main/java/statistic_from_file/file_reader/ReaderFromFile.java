package statistic_from_file.file_reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderFromFile {

    private BufferedReader bufferedReader;
    private final String filePath;
    private StringBuilder file;

    public ReaderFromFile(String filePath) {
        this.filePath = filePath;
    }

    private void createBufferedReader() {
        try {
            bufferedReader = new BufferedReader(new FileReader(this.filePath));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    private void setBufferedReader(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
    }

    public String readFromFile() {
        createBufferedReader();
        String line;
        try {
            while ((line = bufferedReader.readLine()) != null) {
                file.append(line);
                file.append(" ");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return file.toString();
    }
}
