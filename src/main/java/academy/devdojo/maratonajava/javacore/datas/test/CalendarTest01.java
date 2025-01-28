package academy.devdojo.maratonajava.javacore.datas.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    //SISTEMA LEGADO PROVAVELMENTE USA CLASSES DATE E CALENDAR
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        System.out.println(date);
        System.out.println(c.get(Calendar.DAY_OF_MONTH)+ "/"+c.get(Calendar.MONTH)+1+"/"+c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
    }
}