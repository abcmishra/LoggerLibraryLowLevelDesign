import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileAppender implements Appender {
    private BufferedWriter writer;

    public FileAppender(String filePath) throws IOException {
        writer = new BufferedWriter(new FileWriter(filePath, true));
    }

    @Override
    public void append(LogEvent event) {
        try {
            writer.write(event.format());
            writer.newLine();
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
