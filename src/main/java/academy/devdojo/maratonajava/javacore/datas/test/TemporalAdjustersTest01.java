package academy.devdojo.maratonajava.javacore.datas.test;

import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;
import java.time.DayOfWeek;
import java.time.LocalDate;
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
    }
}
