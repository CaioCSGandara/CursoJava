package academy.devdojo.maratonajava.javacore.formatacao.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        //formatações com o pacote java.time
        //format = seu objeto para string
        //parse = string para seu objeto

        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(s1);
        System.out.println(s2);

        //para fazer o contrario, escolher um padrao

        LocalDate parse1 = LocalDate.parse("20210219", DateTimeFormatter.BASIC_ISO_DATE);
        //usar a String de acordo com o padrao passado no segundo parametro

        System.out.println(parse1);

        //tambem da para usar LocalDateTime

        LocalDateTime ldt = LocalDateTime.now();
        String s3 = ldt.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s3);

        LocalDateTime ldt2 = LocalDateTime.parse("2025-02-03T20:19:14.0861014", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(ldt2);

        //tambem da pra criar formatações personalizas e somar com o Locale

        DateTimeFormatter formatBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dateBr = date.format(formatBr);
        System.out.println(dateBr);

        DateTimeFormatter formatGr = DateTimeFormatter.ofPattern("dd/MMMM/yyyy", Locale.GERMAN);

        String dateGr = date.format(formatGr);

        System.out.println(dateGr);

    }
}
