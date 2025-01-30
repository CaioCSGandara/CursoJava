package academy.devdojo.maratonajava.javacore.datas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {

    public static void main(String[] args) {

        //junçao de LocalDate e LocalTime

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        System.out.println("Dia: " + ldt.getDayOfMonth() +
                "/"+ldt.getMonthValue()+
                "/"+ldt.getYear() +
                "\nHora: " + ldt.getHour() +
                ":" + ldt.getMinute() +
                ":" + ldt.getSecond());

        LocalDate date = LocalDate.parse("2022-08-06"); //retorna LocalTime atraves de String
        LocalTime time = LocalTime.parse("21:45:21"); //retorna LocalTime atraves de String
        //obs: nos exemplos acima, tem que seguir esse formato em específico

        System.out.println(date);
        System.out.println(time);

        LocalDateTime ldt2 = date.atTime(time); //obter LocalDateTime com LocalDate e LocalTime específico
        System.out.println(ldt2);


    }
}
