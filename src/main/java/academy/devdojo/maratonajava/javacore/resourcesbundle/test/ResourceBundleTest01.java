package academy.devdojo.maratonajava.javacore.resourcesbundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        //maneira de utilizar diversas linguagens no seu sistema
        //criar arquivos separados com as strings em cada idioma
        //e referencia-los aqui
        //assim vamos internacionalizar as linguagens do sistema
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        boolean sasa = bundle.containsKey("sasa");
        boolean hello = bundle.containsKey("hello");
        System.out.println(sasa);
        System.out.println(hello);
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));

        ResourceBundle bundleBr = ResourceBundle.getBundle("messages", Locale.getDefault());


        boolean sasa2 = bundleBr.containsKey("sasa");
        boolean hello2 = bundleBr.containsKey("hello");
        System.out.println(sasa2);
        System.out.println(hello2);
        System.out.println(bundleBr.getString("hello"));
        System.out.println(bundleBr.getString("good.morning"));

        //outros metodos
        System.out.println(bundle.getBaseBundleName());
        System.out.println(bundle.getKeys());
        System.out.println(bundle.keySet());
        System.out.println(bundle.getLocale());

        //fallback:
        //Locale("fr", "CA")
        //vai procurar messages_fr_CA.properties, se nao achar:
        //messages_fr.properties, se nao achar:
        //system default: messages_pt_BR_properties, se nao achar:
        //messages_pt.properties, se nao achar:
        //messages.properties -> ultima tentativa possível
        //se nao achar, lançará exceção
        //obs: usar fallback a seu favor: colocar msgs globais no arquivo messages.properties


    }
}
