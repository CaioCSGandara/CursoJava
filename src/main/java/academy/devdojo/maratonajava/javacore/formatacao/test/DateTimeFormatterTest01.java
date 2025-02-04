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

        //EXERCICIOS

        // 1. Formatando uma Data para um Padrão Específico
        // Escreva um programa em Java que obtenha a data e hora atual e a formate no seguinte formato:
        // "dd/MM/yyyy HH:mm:ss"
        // Utilize DateTimeFormatter para realizar essa formatação.
        System.out.println("\nEx. 1: ");
        LocalDateTime ldt3 = LocalDateTime.now();
        DateTimeFormatter ex1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println(ldt3.format(ex1));


        // 2. Convertendo uma String para LocalDateTime
        // Crie um programa que receba uma string no formato "2025-02-03T15:30" e a converta para um objeto LocalDateTime usando DateTimeFormatter.
        System.out.println("\nEx. 2:");
        String s4 = "2025-02-03T15:30";
        LocalDateTime ldt4 = LocalDateTime.parse(s4, DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(ldt4 + "," + (ldt4 instanceof LocalDateTime));


        // 3. Formatando Datas em Diferentes Idiomas
        // Modifique o programa do exercício 1 para exibir a data no formato "d 'de' MMMM 'de' yyyy"
        // (por exemplo, "3 de fevereiro de 2025") para o idioma português do Brasil.
        System.out.println("\nEx. 3: ");
        DateTimeFormatter ex3 = DateTimeFormatter.ofPattern("d 'de' MMMM 'de' yyyy", new Locale("pt", "BR"));
        System.out.println(ldt3.format(ex3));

        // 4. Convertendo um Timestamp para Formato Personalizado
        // Dado um LocalDateTime representando o momento atual, exiba-o no formato "EEE, dd MMM yyyy HH:mm:ss"
        // (exemplo: "Seg, 03 Fev 2025 15:30:00").
        // Utilize um DateTimeFormatter que exiba o nome do dia da semana abreviado.
        System.out.println("\nEx. 4: ");
        LocalDateTime ldt5 = LocalDateTime.now();
        Locale br1 = new Locale("pt", "BR");
        Locale jp = Locale.JAPAN;
        DateTimeFormatter ex5 = DateTimeFormatter.ofPattern("EEE, dd MMM yyyy HH:mm:ss", br1);
        DateTimeFormatter ex5dot1 = DateTimeFormatter.ofPattern("EEE, dd MMM yyyy HH:mm:ss", jp);
        System.out.println(ldt5.format(ex5));
        System.out.println(ldt5.format(ex5dot1));
    }
}
