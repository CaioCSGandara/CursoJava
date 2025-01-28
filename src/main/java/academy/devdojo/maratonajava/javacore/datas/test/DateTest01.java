package academy.devdojo.maratonajava.javacore.datas.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(); //data atual
        //guarda um long em ms

        System.out.println(date.getTime());
        System.out.println(date.before(new Date(100_000_000)));
        System.out.println(date.toLocaleString());
    }

}
