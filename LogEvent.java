import java.time.LocalDateTime;

/*

Represents a log entry, containing the message, log level, timestamp, and other metadata.
This class encapsulates the details of a single logging event.
 */
public class LogEvent {
    private LogLevel logLevel;
    private String message;
    private LocalDateTime timeStamp;

    public LogEvent(LogLevel logLevel,String message){
        this.logLevel=logLevel;
        this.message=message;
        this.timeStamp= LocalDateTime.now();
    }
    public String format() {
        // Return a formatted string with the timestamp, log level, and message
        return String.format("[%s] %s: %s", timeStamp, logLevel, message);
    }
    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public LogLevel getLogLevel() {
        return logLevel;
    }

    public String getMessage() {
        return message;
    }

    public void setLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
