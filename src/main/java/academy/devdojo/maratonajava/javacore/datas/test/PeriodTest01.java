package academy.devdojo.maratonajava.javacore.datas.test;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.time.temporal.UnsupportedTemporalTypeException;
import java.util.Date;

public class PeriodTest01 {
    //parecido com Duration
    //trabalha com diferenças entre datas
    //dias, meses, anos... etc

    //EXERCÍCIO 1: MOSTRAR DIFERENÇA ENTRE DATAS:
    public static void diferencaEntreDatas(String d1, String d2) {
        System.out.println("Ex. 1:");
        System.out.println();
        try {
            LocalDate l1 = LocalDate.parse(d1);
            LocalDate l2 = LocalDate.parse(d2);

            System.out.println("Anos: "+ Period.between(l2, l1).getYears() +
                    "\nMeses: " + Period.between(l2, l1).getMonths() +
                    "\nDias: " + Period.between(l2, l1).getDays());
        }
        catch (DateTimeParseException e) {
            System.err.println("Erro: " + e.getMessage());
        }

    }

    //EXERCÍCIO 2: SOMAR E SUBTRAIR PERÍODO DE UMA DATA

    public static void somarESubtrairPeriodo(String data) {
        System.out.println("\nEx. 2:");
        System.out.println();
        try {
            LocalDate d1 = LocalDate.parse(data);

            d1 = d1.plusDays(10);
            System.out.println(d1);
            d1 = d1.plusWeeks(5);
            System.out.println(d1);
            d1 = d1.plusMonths(2);
            System.out.println(d1);
            d1 = d1.plus(4, ChronoUnit.YEARS);
            System.out.println(d1);
        }
        catch(DateTimeParseException | UnsupportedTemporalTypeException | ArithmeticException e) {
            System.err.println("Erro: " + e.getMessage());
        }
        catch(DateTimeException e) {
            System.err.println("Erro: " + e.getMessage());
        }

    }

    //EXERCÍCIO 3: VERIFICAR SE PERÍODO É NEGATIVO

    public static boolean isPeriodNegative(String d1, String d2) {
        System.out.println("\nEx. 3:");
        try {
            LocalDate l1 = LocalDate.parse(d1);
            LocalDate l2 = LocalDate.parse(d2);

            return Period.between(l1, l2).isNegative();

        }
        catch (DateTimeParseException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    //EXERCÍCIO 4: CONTAR ANIVERSÁRIOS A PARTIR DE DATA

    public static void countBirthdays(String date) {
        System.out.println("\nEx. 4:");
        try {
            LocalDate l1 = LocalDate.parse(date);

            System.out.println("Se passaram "+Period.between(l1, LocalDate.now()).getYears()+" aniversários!");
        }
        catch (DateTimeParseException e) {
            System.err.println(e.getMessage());
        }

    }

    public static void main(String[] args) {
        //nao aceita LocalDateTime, apenas LocalDate

        LocalDate ld1 = LocalDate.now();
        LocalDate ld2 = LocalDate.now().plusDays(7);
        Period p1 = Period.between(ld1, ld2);

        System.out.println(p1);

        System.out.println(Period.ofWeeks(50));
        //nao da pra pegar a qtd de mes a partir de dias, semanas, etc
        //para isso, se usa a classe ChronoUnit


        //EXERCÍCIOS:
        //EX. 1:

        PeriodTest01.diferencaEntreDatas("2025-01-31", "1999-01-22");
        PeriodTest01.somarESubtrairPeriodo("1999-01-22");
        System.out.println(PeriodTest01.isPeriodNegative("1999-01-22","2025-01-31"));
        PeriodTest01.countBirthdays("1999-01-22");

    }
}
