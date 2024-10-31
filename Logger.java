import java.util.ArrayList;
import java.util.List;

/*
1. The main class responsible for logging messages at various levels.
2.  It provides methods like logInfo(), logWarn(), and logError(),
   each allowing different levels of logging.
3.Maintains a list of Appenders (output destinations like console, files, etc.)
 and formats logs before sending them to the appenders.

 */
public class Logger {
    private List<Appender> appenderList;
    private LogLevel logLevel;

    public Logger(LogLevel logLevel){
        this.logLevel=logLevel;
        this.appenderList= new ArrayList<>();
    }
    /*
    The ordinal() method in Java is used with enums and
    returns the position of an enum constant in its enum declaration, starting with 0.
    Each enum constant has a unique ordinal value based on its declaration order.
    public enum LogLevel {
    DEBUG,   // ordinal = 0
    INFO,    // ordinal = 1
    WARN,    // ordinal = 2
    ERROR    // ordinal = 3
}

     */
    public void log(LogLevel logLevel, String message) {
        if (logLevel.ordinal() >= this.logLevel.ordinal()) { // Step 2: Level check
            LogEvent logEvent = new LogEvent(logLevel, message); // Step 3: Create log event
            for (Appender appender : appenderList) { // Step 4: Send to appenders
                appender.append(logEvent);
            }
        }
    }

    public void addAppender(Appender appender) {
        appenderList.add(appender);
    }

}
