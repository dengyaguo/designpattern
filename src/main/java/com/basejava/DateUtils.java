package com.basejava;


import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
@Slf4j
public class DateUtils {

    public static void main(String[] args) throws InterruptedException {


     /*   DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime start = LocalDateTime.now();
        LocalDateTime end = now.plusMinutes(10);
        Duration duration = Duration.between(start,end);
        long millis = duration.toMillis();//相差毫秒数
        System.out.println(596399 / (1000 * 60));*/
     test1();

    }

    public void test(){

    }

    private static void test1() {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime start = now.minusDays(30);
        System.out.println(now);
        System.out.println(start);

        LocalDateTime toDateTime = LocalDateTime.of(2019, 9, 11, 7, 45, 55);
        LocalDateTime tempDateTime = LocalDateTime.of(2019, 9, 11, 7, 40, 45);

        long days = tempDateTime.until( toDateTime, ChronoUnit.DAYS);


        long hours = tempDateTime.until( toDateTime, ChronoUnit.HOURS);

        long minutes = tempDateTime.until( toDateTime, ChronoUnit.MINUTES);
        tempDateTime = tempDateTime.plusMinutes( minutes );

        long seconds = tempDateTime.until( toDateTime, ChronoUnit.SECONDS);

        System.out.println(
                days + " 天 " +
                        hours + " 小时 " +
                        minutes + " 分 " +
                        seconds + " 秒.");
    }
}
