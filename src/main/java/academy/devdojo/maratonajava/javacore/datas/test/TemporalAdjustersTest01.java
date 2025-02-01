package academy.devdojo.maratonajava.javacore.datas.test;

import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        //classe utilitária, todos os metodos são static
        //serve para fazer ajustes no tempo

        LocalDate now = LocalDate.now();
        System.out.println(now.withDayOfMonth(20));//trocando apenas o dia
        System.out.println(now.withMonth(5));//trocando apenas dia do mes

        //hoje é quinta. quando é a proxima quinta?

        System.out.println(now.with(TemporalAdjusters.next(DayOfWeek.THURSDAY)));
        System.out.println(now.with(TemporalAdjusters.previous(DayOfWeek.THURSDAY)));
        System.out.println(now.with(TemporalAdjusters.lastDayOfMonth()));


        //EXERCICIOS

        //Ex. 1: Encontrar proxima segunda feira a partir e uma data
        System.out.println("Ex. 1: Encontrar proxima segunda feira a partir e uma data");

        LocalDate l1 = LocalDate.parse("2025-02-05");
        System.out.println(l1.with(TemporalAdjusters.next(DayOfWeek.MONDAY)));

        //Ex.2 Encontrar último dia do mes x no ano y
        System.out.println("\nEx.2 Encontrar último dia do mes x no ano y");
        LocalDate l2 = LocalDate.of(2025, 02, 01);
        System.out.println(l2.with(TemporalAdjusters.lastDayOfMonth()));

        //Ex. 3: Encontrar primeiro sabado de mes x no ano y
        System.out.println("\nEx. 3: Encontrar primeiro sabado de mes x no ano y");
        LocalDate l3 = LocalDate.now().withDayOfMonth(1);
        System.out.println(l3.with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY)));

        //Ex. 4: Encontrar a proxima sexta-feira 13:
        System.out.println("\nEx. 4: Encontrar a proxima sexta-feira 13:");
        LocalDate l4 = LocalDate.now().withDayOfMonth(13);
        while(l4.getDayOfWeek()!=DayOfWeek.FRIDAY) {
            l4 = l4.plusMonths(1);
        }
        System.out.println(l4);

        //Ex. 5: Encontrar a última sexta-feira do mes
        System.out.println("\nEx. 5: Encontrar a última sexta-feira do mes");
        LocalDate l5 = LocalDate.now();
        System.out.println(l5.with(TemporalAdjusters.lastInMonth(DayOfWeek.FRIDAY)));

    }
}
