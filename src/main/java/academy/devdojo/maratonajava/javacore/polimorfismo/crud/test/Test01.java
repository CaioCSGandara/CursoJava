package academy.devdojo.maratonajava.javacore.polimorfismo.crud.test;

import academy.devdojo.maratonajava.javacore.polimorfismo.crud.domain.Product;
import academy.devdojo.maratonajava.javacore.polimorfismo.crud.domain.User;
import academy.devdojo.maratonajava.javacore.polimorfismo.crud.services.DbHandler;

public class Test01 {
    public static void main(String[] args) {
        User user1 = new User("1", "Caio", "caiocsgandara@gmail.com");
        Product product1 = new Product("2", "Desinfetante", "Produto de limpeza", 12.5f);

        DbHandler.dbGet(user1);
        DbHandler.dbGet(product1);

        DbHandler.dbPost(user1);
        DbHandler.dbPost(product1);

        DbHandler.dbGetById(user1);
        DbHandler.dbGetById(product1);

        DbHandler.dbPut(user1);
        DbHandler.dbPut(product1);

        DbHandler.dbDelete(user1);
        DbHandler.dbDelete(product1);


    }
}
