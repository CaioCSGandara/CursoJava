package academy.devdojo.maratonajava.javacore.polimorfismo.crud.services;

import academy.devdojo.maratonajava.javacore.polimorfismo.crud.domain.Entity;

public class DbHandler {
    public static void dbGet(Entity e) {
        e.get();
    }

    public static void dbGetById(Entity e) {
        e.getById(e.getId());
    }

    public static void dbPost(Entity e) {
        e.post(e);
    }

    public static void dbPut(Entity e) {
        e.put(e);
    }

    public static void dbDelete(Entity e) {
        e.delete(e.getId());
    }

}
