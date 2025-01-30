package academy.devdojo.maratonajava.javacore.formatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {

        Locale lBR = Locale.getDefault();
        Locale lEN = new Locale("en", "US");
        Locale lJP = Locale.JAPAN;
        Locale lAR = new Locale("ar", "SA");

        NumberFormat nfBR = NumberFormat.getCurrencyInstance(lBR);
        NumberFormat nfEN = NumberFormat.getCurrencyInstance(lEN);
        NumberFormat nfJP = NumberFormat.getCurrencyInstance(lJP);
        NumberFormat nfAR = NumberFormat.getCurrencyInstance(lAR);

        System.out.println(nfBR.format(10_000.0983));
        System.out.println(nfEN.format(10_000.0983));
        System.out.println(nfJP.format(10_000.0983));
        System.out.println(nfAR.format(10_000.0983));

        String valorYenes = "￥10,000";

        try {
            System.out.println(nfJP.parse(valorYenes)); //parse para converter em numero, assim que guarda no banco
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }
}
