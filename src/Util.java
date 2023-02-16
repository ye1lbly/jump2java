import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
    public static String getCurrentDate(String fmt) { //static method
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        return sdf.format(new Date());
    }

    public static void main(String[] args) {
        System.out.println(Util.getCurrentDate("yyyyMMdd"));
    }
}
