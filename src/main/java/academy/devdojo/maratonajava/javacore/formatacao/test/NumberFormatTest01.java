package academy.devdojo.maratonajava.javacore.formatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        //classe abstrata, nao pode fazer o new

        //Locale usado para instanciar a localização:
        Locale localePT = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeGER = Locale.GERMAN;
        Locale localeAUS = new Locale("en", "AU");

        //NumberFormat passando a localização:
        NumberFormat nfPT = NumberFormat.getInstance(localePT);
        NumberFormat nfJP = NumberFormat.getInstance(localeJP);
        NumberFormat nfGER = NumberFormat.getInstance(localeGER);
        NumberFormat nfAUS = NumberFormat.getInstance(localeAUS);

        //Formatando um valor baseado na localização:
        System.out.println(nfPT.format(10_000.3105));
        System.out.println(nfJP.format(10_000.3105));
        System.out.println(nfGER.format(10_000.3105));
        System.out.println(nfAUS.format(10_000.3105));
        System.out.println("qtd casas decimais no japao: " + nfJP.getMaximumFractionDigits());
    }
}
