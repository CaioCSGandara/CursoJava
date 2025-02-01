package academy.devdojo.maratonajava.javacore.datas.test;

import java.sql.SQLOutput;
import java.time.*;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        //zonas suportadas pelo java:
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        //zona do SO:
        System.out.println(ZoneId.systemDefault());
        //zona arbitraria:
        System.out.println(ZoneId.of("Asia/Tokyo"));

        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime zdt = now.atZone(ZoneId.of("Asia/Tokyo"));
        System.out.println(zdt);

        //da para usar com varias classes:
        //muito bom para formatar o Instant
        Instant i = Instant.now();
        i.atZone(ZoneId.of("Asia/Tokyo"));

        //quando nao souber a zona e apenas a dif de horario:
        //usar ZoneOffset

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        //setar horario para Manaus:

       ZoneOffset offsetManaus = ZoneOffset.of("-04:00");

        System.out.println(i.atOffset(offsetManaus)); //traz offset sem a zona

        OffsetDateTime ofdt = i.atOffset(offsetManaus);

        System.out.println(ofdt);

        // EXERCÍCIOS

        //Ex. 1: Converter data do sistema
        System.out.println("\nEx. 1: Converter data do sistema");

        ZonedDateTime zd1 = Instant.now().atZone(ZoneId.systemDefault());
        ZonedDateTime zd2 = Instant.now().atZone(ZoneId.of("America/New_York"));
        ZonedDateTime zd3 = Instant.now().atZone(ZoneId.of("Europe/London"));
        ZonedDateTime zd4 = Instant.now().atZone(ZoneId.of("Asia/Tokyo"));

        System.out.println(zd1);
        System.out.println(zd2);
        System.out.println(zd3);
        System.out.println(zd4);

        //Ex. 2: Calcular diferença entre fusos
        System.out.println("\nEx. 2: Calcular diferença entre fusos");
        ZonedDateTime zd5 = LocalDateTime.now().atZone(ZoneId.of("America/New_York"));
        ZonedDateTime zd6 = LocalDateTime.now().atZone(ZoneId.of("Europe/London"));
        System.out.println("Diferença: " + Duration.between(zd5, zd6));

        //Ex. 3: Adicionar e subtrair tempo em OffsetDateTime
        //obs: offsetDateTime é pra quando nao sabemos a zona e apenas a dif de horario
        //principal diferença com a ZoneOffSet -> esta conta a partir de Greenwich
        //já a OffsetDateTime te da a opção de passar a partir de onde vai contar
        System.out.println("\nEx. 3: Adicionar e subtrair tempo em OffsetDateTime");
        OffsetDateTime odt = OffsetDateTime.of(LocalDateTime.now(), ZoneOffset.of("-03:00"));
        System.out.println(odt);
        System.out.println(odt.plusHours(5).plusMinutes(45));
        System.out.println(odt.plusHours(5).plusMinutes(45).minusDays(2));

        //Ex. 4: Converter ZonedDateTime para OffsetDateTime
        System.out.println("\nEx. 4: Converter ZonedDateTime para OffsetDateTime");
        ZonedDateTime zd8 = Instant.now().atZone(ZoneId.of("America/New_York"));
        OffsetDateTime odt8 = OffsetDateTime.of(zd8.toLocalDateTime(), ZoneOffset.of("+00:00"));
        System.out.println(zd8);
        System.out.println(odt8);
        System.out.println(Instant.now());




    }
}
