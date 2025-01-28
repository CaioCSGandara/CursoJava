package academy.devdojo.maratonajava.javacore.formatacao.test;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault()); // default do SO

        String[] isoCountries = Locale.getISOCountries(); //lista de paises suportados
        String[] isoLanguages = Locale.getISOLanguages(); // lista de linguas suportadas

        for(String country: isoCountries) {
            System.out.print(country + " ");
        }
        System.out.println();
        for(String language: isoLanguages) {
            System.out.print(language + " ");
        }
    }
}
