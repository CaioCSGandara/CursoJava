package academy.devdojo.maratonajava.javacore.datas.test;

import java.time.*;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

public class DurationTest01 {
    //EX1. DIFERENÇA ENTRE DOIS HORÁRIOS
    public static void diferencaEntreHorarios(String h1, String h2) {
        System.out.println("\nEx. 1: ");
        try {
            LocalTime l1 = LocalTime.parse(h1);
            LocalTime l2 = LocalTime.parse(h2);
            Duration dif = Duration.between(l1, l2);
            System.out.println(dif.toHoursPart() + "H" + dif.toMinutesPart() + "M" + dif.toSecondsPart() + "S");
        } catch (DateTimeParseException | ArithmeticException e) {
            e.printStackTrace();
        } catch (DateTimeException e) {
            e.printStackTrace();
        }
    }

    //EX2. CONVERTER DURAÇÃO EM S PARA HH:MM:SS
    public static void converteSecEmHorario(int sec) {
        System.out.println("\nEx. 2: ");
        try {
            Duration d1 = Duration.ofSeconds(sec);
            System.out.println(sec + " segundos equivalem a: " +
                    d1.toHoursPart() + " horas, " +
                    d1.toMinutesPart() + " minutos e " +
                    d1.toSecondsPart() + "segundos.");
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    //EX3. SOMAR E SUBTRAIR DURAÇÃO A UM HORARIO
    public static void somarESubtrairDuracao(String h) {
        System.out.println("Ex.3: ");
        try {
            Duration d1 = Duration.parse(h);
            long secondsToAdd = Duration.parse("PT2H45M30S" ).getSeconds();
            System.out.println("Antes de add: " + d1);
            d1 = d1.plusSeconds(secondsToAdd);
            System.out.println("Depois de add: " + d1);
            d1 = d1.minusSeconds(secondsToAdd);
            System.out.println("Depois de subtrair: " + d1);

        } catch (ArithmeticException | DateTimeParseException e) {
            e.printStackTrace();
        }
    }

    //EX4. CALCULAR QUANTOS SEGUNDOS FALTAM PARA A MEIA NOITE
    public static void secsToMidnight(String h) {
        System.out.println("\nEx.4: ");
        try{
            LocalTime l1 = LocalTime.parse(h);

            System.out.println("Faltam " + Duration.between(l1, LocalTime.MAX).toSeconds() + " segundos para meia noite.");
        }
        catch(DateTimeException | ArithmeticException e) {
            e.printStackTrace();
        }

    }

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

        //EXERCÍCIOS

        DurationTest01.diferencaEntreHorarios("08:33:22", "22:44:34");
        DurationTest01.converteSecEmHorario(600);
        DurationTest01.somarESubtrairDuracao("PT10H");
        DurationTest01.secsToMidnight("23:59:30");


    }
}
