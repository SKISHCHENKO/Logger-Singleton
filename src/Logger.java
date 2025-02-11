import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    protected int num = 1;

    private static Logger instance;

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String msg) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        String timestamp = dateFormat.format(new Date());
        System.out.println("[" + timestamp + " " + num++ + "] " + msg);
        num++;
    }
}