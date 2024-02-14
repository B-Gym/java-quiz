package date_time_formatting;

import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Exercise10_8 {
    public static void main(String[] args) {

        ZonedDateTime seoulTime = ZonedDateTime.now();
        ZoneId nyId = ZoneId.of("America/New_York");
        ZonedDateTime nyTime = ZonedDateTime.now().withZoneSameInstant(nyId);

        System.out.println(seoulTime);
        System.out.println(nyTime);

        Duration du = Duration.between(seoulTime, nyTime);

        System.out.println((32400 - (-18000)) / (60 * 60));

        int sec1 = (seoulTime.getHour() * 60 * 60) + (seoulTime.getMinute() * 60) + seoulTime.getMinute();
        int sec2 = (nyTime.getHour() * 60 * 60) + (nyTime.getMinute() * 60) + nyTime.getMinute();

        System.out.println("sec1=" + sec1);
        System.out.println("sec2=" + sec2);
        System.out.println("diff=" + Math.abs(sec1 - sec2) / (60 * 60) + " hrs");
        // System.out.println("diff=" + Math.abs(seoulTime.getHour() - nyTime.getHour())
        // + " hrs");

    }
}
