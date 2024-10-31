import java.util.List;

public class LoggerConfig {
    private LogLevel level;
    private List<Appender> appenders;

    public LoggerConfig(LogLevel level, List<Appender> appenders) {
        this.level = level;
        this.appenders = appenders;
    }

    // Getters
}
