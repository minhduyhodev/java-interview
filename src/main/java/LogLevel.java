public enum LogLevel {
    TRACE("TRC"),
    DEBUG("DBG"),
    INFO("INF"),
    WARNING("WRN"),
    ERROR("ERR"),
    FATAL("FTL");

    private final String abbreviation;

    LogLevel(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}

/*
 * public class LogLine {
 * private String line = "";
 * 
 * public LogLine(String line) {
 * this.line = line;
 * }
 * 
 * public LogLevel getLogLevel() {
 * if (line == null || line.isEmpty()) {
 * throw new IllegalArgumentException("Invalid log line");
 * }
 * 
 * int open = line.indexOf("[");
 * int close = line.indexOf("]", open);
 * 
 * if (open == -1 || close <= open) {
 * throw new IllegalArgumentException("Invalid log line format");
 * }
 * 
 * String abbreviation = line.substring(open + 1, close).toUpperCase();
 * 
 * return switch(abbreviation) {
 * case "TRC" -> LogLevel.TRACE;
 * case "DBG" -> LogLevel.DEBUG;
 * case "INF" -> LogLevel.INFO;
 * case "WRN" -> LogLevel.WARNING;
 * case "ERR" -> LogLevel.ERROR;
 * case "FTL" -> LogLevel.FATAL;
 * default -> throw new IllegalArgumentException("Unknown log level: " +
 * abbreviation);
 * };
 * }
 * }
 * 
 */
