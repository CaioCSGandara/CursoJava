package academy.devdojo.maratonajava.javacore.datas.test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest01 {

    public static void main(String[] args) {

        //trabalhar com qtd de tempo
        //mostra as diferenças em horas, min e sec
        //pega intervalo entre duas datas
        //baseada em segundo e nanossegundo
        //LocalDate nao pode usar, pq nao suporta segundos

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime twoYearsFromNow = LocalDateTime.now().plusYears(2);
        LocalTime timeNow = LocalTime.now();
        LocalTime minusSevenHoursFromNow = LocalTime.now().minusHours(7);

        Duration d1 = Duration.between(now, twoYearsFromNow);

        Duration d2 = Duration.between(timeNow, minusSevenHoursFromNow);

        Duration d3 = Duration.between(Instant.now(), Instant.now().plusSeconds(6000));

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        System.out.println(Duration.ofDays(5));


    }
}
