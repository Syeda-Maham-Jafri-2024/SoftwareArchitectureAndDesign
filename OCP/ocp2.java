public interface ILogger
{
    void Log(string message);
}

public class FileLogger : ILogger
{
    public void Log(string message)
    {
        File.WriteAllText("log.txt", message);
    }
}

public class DatabaseLogger : ILogger
{
    public void Log(string message)
    {
        // Code to log to database
    }
}

public class ExternalServiceLogger : ILogger
{
    public void Log(string message)
    {
        // Code to log to an external service
    }
}

public class Logger
{
    private ILogger logger;
    
    public Logger(ILogger logger)
    {
        this.logger = logger;
    }
    
    public void Log(string message)
    {
        logger.Log(message);
    }
}

// Client code
ILogger logger = new FileLogger(); // Or new DatabaseLogger(), new ExternalServiceLogger()
Logger log = new Logger(logger);
log.Log("This is a log message");
