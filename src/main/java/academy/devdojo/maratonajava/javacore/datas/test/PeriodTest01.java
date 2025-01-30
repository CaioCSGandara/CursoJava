package academy.devdojo.maratonajava.javacore.datas.test;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest01 {
    //parecido com Duration
    //trabalha com diferenças entre datas
    //dias, meses, anos... etc

    public static void main(String[] args) {
        //nao aceita LocalDateTime, apenas LocalDate

        LocalDate ld1 = LocalDate.now();
        LocalDate ld2 = LocalDate.now().plusDays(7);
        Period p1 = Period.between(ld1, ld2);

        System.out.println(p1);

        System.out.println(Period.ofWeeks(50));
        //nao da pra pegar a qtd de mes a partir de dias, semanas, etc
        //para isso, se usa a classe ChronoUnit
    }
}
