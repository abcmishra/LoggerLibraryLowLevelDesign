import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Logger logger = new Logger(LogLevel.INFO);

        // Configure appenders
        ConsoleAppender consoleAppender = new ConsoleAppender();
        FileAppender fileAppender = new FileAppender("logs.txt");

        // Add appenders to the logger
        logger.addAppender(consoleAppender);
        logger.addAppender(fileAppender);

        // Log messages
        logger.log(LogLevel.INFO, "This is an informational message.");
        logger.log(LogLevel.WARN, "This is a warning message.");
        logger.log(LogLevel.ERROR, "This is an error message.");
    }
}
