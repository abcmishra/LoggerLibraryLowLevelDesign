/*
Implementation of Appender that writes log messages to the console.
Formats the LogEvent before outputting it to the console
 */
public class ConsoleAppender implements  Appender{
    @Override
    public void append(LogEvent event){
        System.out.println(event.format());
    }
}
