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
    }
}
