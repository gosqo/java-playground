package date;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class TimeClassesLook {

    public static void main(String[] args) {
        Object[] arr = {
                new Date() // seconds
                , LocalDateTime.now() // nano seconds
                , Instant.now() // nano seconds
                , Instant.now().atZone(ZoneId.systemDefault())
                , new Date().toInstant() // milli seconds (Date -> Instant)
        };

        Arrays.stream(arr)
                .sorted(Comparator.comparing(object -> object.getClass().getSimpleName()))
                .forEach(object -> {
                    String className = object.getClass().getSimpleName();
                    String formatted = String.format("%-15s ", className);
                    System.out.println(formatted + object);
                });
    }
}
