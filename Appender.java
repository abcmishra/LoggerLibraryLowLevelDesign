
/*
An interface for different types of output destinations for log messages (console, file, etc.).
Each Appender implementation defines how the LogEvent is written or displayed
 */
public interface Appender {
    void append(LogEvent event);
}
