package academy.devdojo.maratonajava.javacore.datas.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {

        System.out.println(new Date());
        System.out.println(Calendar.getInstance());

        //agora, estamos no pacote java.time
        //clase introduzida na versao 8
        //thread safe
        // a partir daqui, nao precisamos mais de Date()


        //LocalDate não trabalha com hora, só com data
        //possui vários métodos utilitarios
        LocalDate date = LocalDate.of(2022, Month.JANUARY, 21);
        System.out.println(date.getDayOfWeek() + ", " +
                date.getDayOfMonth() + "/" +
                date.getMonthValue() + "/" +
                date.getYear());

        System.out.println("Ano é bisexto?" + date.isLeapYear());
        System.out.println("Quantidade de dias do mes" + date.lengthOfMonth());
        System.out.println(date.get(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH)); //da pra fazer um monte de coisa aqui
        System.out.println(date); //da para mandar diretamente pro banco, normalmente é salvo já nesse formato

        LocalDate agora = LocalDate.now(); // pega data de agora
        LocalDate futuro = agora.plusDays(4); // tem que instanciar de novo, elas são IMUTÁVEIS
        System.out.println(futuro);
        System.out.println(futuro.getEra());
    }
}
