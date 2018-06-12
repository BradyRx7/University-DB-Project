/**
 * Brady Reed
 * Umass Lowell INFO3010
 * 9/20/17
 */


/**
 * Logger Class
 *
 * Comments: Logging utility for sending application status strings
 *           to the console.
 * 
 * Variables:
 * Log levels constants: 1- error, 2- warning, 3- informational, 4- debug
 * String mLogString; String to be tested and then printed to log if
 *          log level qualifies 
 * boolean mLogEnabled;  holds logger status, true = ON
 * int mLogLevel; holds current log level
 */



package bradyreed.utilities;


public final class Logger {
    
    // Constants for log level
     public static final int ERROR = 1;
     public static final int WARN = 2;
     public static final int INFO = 3;
     public static final int DEBUG = 4;
    
    // Class variables   
    private static String mLogString; // String to be printed to log
    private static boolean mLogEnabled; // Boolean to hold logger status
    private static int mLogLevel; // Log level indicator
   
    
    // Private constructor to prevent instantiation of the class 
    private static void Logger (){
    }
    
    /**
     * Validates the state of the logger and its inputs
     * If *any* of the parameters do not pass the checks the 
     * method returns false (=not ready). Also prints an error message if
     * string input is null. Allows for every message of lower log levels to be
     * included in log.
     * 
     *
     * @param strMessage        logger string to be entered in log
     * @param loggerLevel       numerical level the logger is set to record
     * @return logReady         true if logger is ready, false if not
     */
    private static boolean isLoggerReady(String strMessage, int logEntryLevel){
        boolean logReady = false;
        
        if (mLogEnabled == false) {
            return logReady;
        } else if (logEntryLevel > mLogLevel || logEntryLevel < ERROR) {
            return logReady;
        } else if (strMessage == null){
            mLogString = "Log message failure: null string";
            System.out.print(mLogString);
            return logReady;
        } else {
            logReady = true;
        }
        
        return logReady;
    }
    
    
    /**
     * Methods to specify log level within the class: logDebug(), logInfo(),
     *          logError(), and logWarn()
     *
     * Tests for acceptable logging conditions with isLoggerReady() class 
     * method and if tests pass then it prints message the console
     * 
     * @param strMessage        logger string to be entered in log         
     */
    public static void logDebug(String strMessage){
        if (isLoggerReady(strMessage, DEBUG) == true){
            mLogString = strMessage;
            System.out.println("DEBUG: " + mLogString);
        }        
    }
    
    public static void logInfo(String strMessage){
        if (isLoggerReady(strMessage, INFO) == true){
            mLogString = strMessage;
            System.out.println("INFO: " + mLogString);
        }
    }
    
    public static void logWarning(String strMessage){
        if (isLoggerReady(strMessage, WARN) == true){
            mLogString = strMessage;
            System.out.println("WARNING: " + mLogString);
        }
    }
    
    public static void logError(String strMessage){
        if (isLoggerReady(strMessage, ERROR) == true){
            mLogString = strMessage;
            System.out.println("ERROR: " + mLogString);
        } 
    }
    
    // Logging enable and disable toggles: enableLogging() and disableLogging()
    public static void enableLogging(){
        mLogEnabled = true;
    }
    
    public static void disableLogging(){
        mLogEnabled = false;
    }
    
    // Logging status check method for external. True = enabled
    public static boolean isLoggingEnabled(){
        if (mLogEnabled){
            return true;
        } else {
            return false;
        }
    }
    
    // Reports the log level in an integer to a program using this utility
    public static int logLevel(){
        int logLevel = mLogLevel;
            return logLevel;
    }
    
    /**
     * setLogLevel()
     * 
     * Specifies log level within the class
     *
     * Accepts an integer referring to log level defined as constants in class
     * 1- error
     * 2- warning,
     * 3- informational,
     * 4- debug
     *
     * @param loggerLevel       numerical level the logger is set to record          
     */
    public static void setLogLevel(int loggerLevel){
        if (loggerLevel > 0 && loggerLevel < 5){
        mLogLevel = loggerLevel;
        } else {
            System.out.println("Invalid log level change: continuing with"  
                  + "last specified log level");
        }
        
    }
}





/**
 *  Test code that can be inserted to check if logger is enabled and its level
 *  This is for test class or other program to use
 * if (!Logger.isLoggingEnabled()){
            System.out.println("Logger not enabled");
        }
        if (Logger.isLoggingEnabled()){
            System.out.println("Logger is enabled");
        } 
        System.out.println("Log level is: " + Logger.logLevel());
*/