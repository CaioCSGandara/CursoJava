package academy.devdojo.maratonajava.javacore.formatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class SimpleDataFormatTest01 {
    public static void main(String[] args) {
        //classe com mais flexibilidade para formatar datas
        //formatar datas baseado em padrões definidos por letras
        //mais personalização
        //principais métodos: format() e parse()
        //format formata uma instancia de Date baseado nos padroes escolhidos
        //parse transforma uma String (baseada no padrao escolhido) em instancia de Date

        //EXEMPLOS ABAIXO: Formatando uma instancia de Date
        String pattern = "dd.MM.yyyy G 'at' HH:mm:ss z"; //cria a sua formatação --> aspas simples para tirar os padrões e colocar algo customizado
        SimpleDateFormat sdf = new SimpleDateFormat(pattern); //passa o formato para a classe que formata de fato
        System.out.println(sdf.format(Calendar.getInstance().getTime())); //chama o metodo format da classe que formata a data, passando uma data

        //OBS: Uma instancia de Date é igual a Calendar.getInstance().getTime()

        String pattern2 =  "'Campinas, 'dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat sdf2 = new SimpleDateFormat(pattern2);

        System.out.println(sdf2.format(new Date()));


        //EXEMPLOS ABAIXO: transformando uma string em Date


        try {
            System.out.println(sdf2.parse("Campinas, 25 de agosto de 2023")); //data está no mesmo formato do sdf2, então funciona
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        //testando junto com locale

        Locale l1 = new Locale("en", "US");
        String pattern3 = "dd'/'MMMM'/'yyyy";
        SimpleDateFormat sdf3 = new SimpleDateFormat(pattern3, l1);
        System.out.println(sdf3.format(new Date())); // saiu January por conta da formatação

    }
}
