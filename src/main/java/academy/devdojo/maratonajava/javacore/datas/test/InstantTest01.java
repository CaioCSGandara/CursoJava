package academy.devdojo.maratonajava.javacore.datas.test;

import java.time.Instant;
import java.time.LocalDateTime;

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

    }
}
