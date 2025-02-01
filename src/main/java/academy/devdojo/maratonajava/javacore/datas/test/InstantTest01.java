package academy.devdojo.maratonajava.javacore.datas.test;

import java.sql.SQLOutput;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class InstantTest01 {
    public static void main(String[] args) {
        //parecida com a Date. mas trabalha com nanossegundos
        //representa um ponto instantaneo numa linha do tempo
        //imutaveis. geram nova instancia
        //interessante para gerar logs

        Instant now = Instant.now();
        System.out.println(now);
        System.out.println(LocalDateTime.now());

        // tem apenas o Z como diferença no retorno
        //zulu time: horario "neutro" -> praticamente UTC

        //zulu time (ou UTC) é muito usado para salvar dados o banco
        //nesse caso, LocalDateTime não está mostrando a zona

        //dividido em:

        System.out.println(now.getEpochSecond());
        //e:
        System.out.println(now.getNano());


        //EXERCICIOS

        //Ex. 1: pegar instante atual
        System.out.println("Ex. 1: pegar instante atual");
        System.out.println(Instant.now());

        //Ex. 2: Diferença entre dois instantes em h,min,sec
        System.out.println("\nEx.2 : Diferença entre dois instantes em h,min,sec");
        Instant i1 = Instant.parse("2024-02-01T10:15:30Z");
        Instant i2 = Instant.parse("2024-02-01T12:45:30Z");

        Duration d1 = Duration.between(i1, i2);

        System.out.println("Diferença de: " + d1.toHoursPart()+":"+d1.toMinutesPart()+":"+d1.toSecondsPart());

        //Ex. 3: Converter Instant para data e hora local

        System.out.println("\nEx. 3: Converter Instant para data e hora local");
        Instant i3 = Instant.now();
        System.out.println("Instant convertido para BRT: " + i3.atZone(ZoneId.of("UTC-3")));
        System.out.println("Tambem da pra usar com ZoneId.systemDefault(): " + i3.atZone(ZoneId.systemDefault()));

        //Ex. 4: Somar e subtrair h, min, sec

        System.out.println("\nEx. 4: Somar e subtrair h, min, sec");

        Instant i4 = Instant.now();
        i4 = i4.plus(5, ChronoUnit.MINUTES).plus(30, ChronoUnit.SECONDS);
        System.out.println(i4);
        i4 = i4.minus(2, ChronoUnit.HOURS);
        System.out.println(i4);



    }
}
