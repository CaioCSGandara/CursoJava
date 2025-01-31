package academy.devdojo.maratonajava.javacore.datas.test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

public class ChronoUnitTest01 {
    // EXERCICIO 1 - CONVERSOR ENTRE DIAS, SEMANAS, MESES E ANOS -------------------------------------
    public static void conversor(long qtd, String unidade) {

        long secs = secConversor(unidade) * qtd;


        if (!unidade.equals("dias")) {
            System.out.println(qtd + " " + unidade + " em dias: " + secs / ChronoUnit.DAYS.getDuration().getSeconds());
        }

        if (!unidade.equals("semanas")) {
            System.out.println(qtd + " " + unidade + " em semanas: " + secs / ChronoUnit.WEEKS.getDuration().getSeconds());
        }

        if (!unidade.equals("meses")) {
            System.out.println(qtd + " " + unidade + " em meses: " + secs / ChronoUnit.MONTHS.getDuration().getSeconds());
        }

        if (!unidade.equals("anos")) {
            System.out.println(qtd + " " + unidade + " em anos: " + secs / ChronoUnit.YEARS.getDuration().getSeconds());
        }

    }

    private static long secConversor(String ud) {
        switch (ud) {
            case "dias":
                return ChronoUnit.DAYS.getDuration().getSeconds();

            case "semanas":
                return ChronoUnit.WEEKS.getDuration().getSeconds();

            case "meses":
                return ChronoUnit.MONTHS.getDuration().getSeconds();

            case "anos":
                return ChronoUnit.YEARS.getDuration().getSeconds();

            default:
                throw new IllegalArgumentException("Valores invalidos para a unidade");
        }
    }

    // EXERCICIO 2 - DIFERENÇA ENTRE DATAS EM DIFERENTES UNIDADES

    public static void diferencaEntreDatas(String d1, String d2) {
        LocalDate l1 = LocalDate.parse(d1);
        LocalDate l2 = LocalDate.parse(d2);
        System.out.println("EXERCICIO 2: ");
        System.out.println("Diferença em dias: " + ChronoUnit.DAYS.between(l1, l2));
        System.out.println("Diferença em semanas: " + ChronoUnit.WEEKS.between(l1, l2));
        System.out.println("Diferença em meses: " + ChronoUnit.MONTHS.between(l1, l2));
        System.out.println("Diferença em anos: " + ChronoUnit.YEARS.between(l1, l2));
    }

    //EXERCÍCIO 3 - DIFERENÇA ENTRE NANOSSEGUNDOS

    public static void diferencaEntreNanosec(Instant i1, Instant i2) {
        System.out.println("EXERCICIO 3: ");
        System.out.println("Diferença entre nanossec: " + ChronoUnit.NANOS.between(i1, i2));
    }

    //EXERCÍCIO 4 - ADICIONAR/SUBSTRAIR DMY A UMA DATA

    public static void addDiaMesAno(String data) {
        LocalDate l1 = LocalDate.parse(data);

        System.out.println("EXERCÍCIO 4: ");
        l1 = ChronoUnit.DAYS.addTo(l1, 5);
        System.out.println("+10 dias: " + l1);
        l1 = ChronoUnit.MONTHS.addTo(l1, 2);
        System.out.println("+2 meses: " + l1);
        l1 = ChronoUnit.YEARS.addTo(l1, 5);
        System.out.println("+5 anos: " + l1);

    }


    public static void main(String[] args) {
        //baseada em sec e nanossec
        //responsavel por unidades de data/periodo
        //facil de manipular diferenças entre dias, meses, anos


//        EXERCÍCIO 1:
//        Scanner teclado = new Scanner(System.in);
//        System.out.println("Digite a qtd: ");
//        long qtd = teclado.nextLong();
//        teclado.nextLine();
//        System.out.println("Digite a unidade: ");
//        String unidade = teclado.nextLine();
//
//        ChronoUnitTest01.conversor(qtd, unidade);

        ChronoUnitTest01.diferencaEntreDatas("2000-06-15", "2025-01-31");
        ChronoUnitTest01.diferencaEntreNanosec(Instant.now(), Instant.now().plusSeconds(1200));
        ChronoUnitTest01.addDiaMesAno("2025-01-31");
    }
}
