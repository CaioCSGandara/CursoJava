package academy.devdojo.maratonajava.javacore.datas.test;

import java.time.LocalTime;

public class LocalTimeTest01 {
    public static void main(String[] args) {

        //funciona igual LocalDate, mas para tempo

        LocalTime lt = LocalTime.of(22, 11, 23);
        System.out.println(lt);

        LocalTime agora = LocalTime.now();
        System.out.println(agora);

        System.out.println("Agora: " + agora.getHour() +
                ":"+
                agora.getMinute() +
                ":"+
                agora.getSecond());

        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);
        //esses dois são usados para dividir os dias, por exemplo para entregar relatorios
    }
}
