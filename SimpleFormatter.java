public class SimpleFormatter {
    public static String format(LogEvent event) {
        return String.format("[%s] %s: %s",
                event.getTimeStamp().toString(),
                event.getLogLevel().toString(),
                event.getMessage());
    }
}
