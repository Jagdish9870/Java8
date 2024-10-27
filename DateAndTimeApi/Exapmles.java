package DateAndTimeApi;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Exapmles {
    public static void main(String[] args) {
        LocalDate now=LocalDate.now();
        System.out.println(now);


        LocalDate customDate=LocalDate.of(2024,12,26);

        System.out.println(customDate);
        // zoned date time

        ZonedDateTime indiaTime=ZonedDateTime.now();
        
        ZonedDateTime newYorkTime =ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(indiaTime);
        System.out.println(newYorkTime);
        System.out.println(ZoneId.getAvailableZoneIds().size());
    }
    
}
