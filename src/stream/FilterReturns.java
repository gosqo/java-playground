package stream;

import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

public class FilterReturns {
    public static void main(String[] args) {
        Date d1 = new Date(1);
        Date d2 = new Date(2);
        Date d3 = new Date(System.currentTimeMillis() + 10000L);

        List<Date> dates = List.of(d1, d2, d3);
        Stream<Date> stream = dates.stream();

        stream
                .filter(date -> date.before(new Date(System.currentTimeMillis()))) // returns true, the item goes next line.
                .forEach(System.out::println);
    }
}
