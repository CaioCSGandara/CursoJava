package academy.devdojo.maratonajava.javacore.polimorfismo.crud.domain;

public interface Crud {
    public void get();

    public void getById(String id);

    public void post(Entity e);

    public void put(Entity e);

    public void delete(String id);
}
