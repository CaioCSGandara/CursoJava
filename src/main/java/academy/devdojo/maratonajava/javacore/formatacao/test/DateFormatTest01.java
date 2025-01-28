package academy.devdojo.maratonajava.javacore.formatacao.test;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest01 {
    public static void main(String[] args) {
        //DATEFORMAT: metodos pre definidos para formatação
        Calendar c = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT); // passando apenas um argumento, usará a data do SO
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM); //
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG); //
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL); // DEFINE A FORMATAÇÃO
        System.out.println(df1.format(c.getTime())); // PASSA A DATA PARA DENTRO DA FORMATAÇÃO
        System.out.println(df2.format(c.getTime()));
        System.out.println(df3.format(c.getTime()));
        System.out.println(df4.format(c.getTime()));




    }
}
