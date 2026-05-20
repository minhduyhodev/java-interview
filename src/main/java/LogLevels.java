public class LogLevels {

    public static String message(String logLine) {
        String result ="";
        if(logLine == null){
            return "";
        }

        int open = logLine.indexOf(":");


        if(open != -1 ){
            return logLine.substring(open + 1).toLowerCase().trim();
        }
        return result;
    }

    public static String logLevel(String logLine) {
        String result ="";
        if(logLine == null){
            return "";
        }

        int open = logLine.indexOf("[");

        int close = logLine.indexOf("]", open);

        if(open != -1 && close > open){
            return logLine.substring(open + 1, close).toLowerCase();
        }
        return result;

    }

    public static String reformat(String logLine) {
        String result ="";
        if(logLine == null){
            return "";
        }

        int open = logLine.indexOf("[");

        int close = logLine.indexOf("]", open);

        if(open != -1 && close > open){
            return logLine.substring(close + 3) + " (" + logLine.substring(open + 1, close).toLowerCase() + ")";
        }
        return result;
    }


    public static void main(String[] args) {
        LogLevels logLevels = new LogLevels();
        String a = logLevels.logLevel("[WARNING]: Disk almost full");
        String b = logLevels.reformat("[INFO]: File moved");
        String c = logLevels.message("[WARNING]:   \tTimezone not set  \r\n");
// => "error"
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
