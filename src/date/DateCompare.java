package date;

import java.util.Date;

public class DateCompare {
    public static void main(String[] args) {
        Date now = new Date();
        Date expiration = new Date(1718763521158L);

        if (isExpired(now, expiration)) System.out.println("Expired");
    }

    private static boolean isExpired(Date object, Date expiration) {
        return object.after(expiration);
    }
}
