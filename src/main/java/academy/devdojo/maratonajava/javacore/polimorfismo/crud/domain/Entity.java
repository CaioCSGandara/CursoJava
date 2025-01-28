package academy.devdojo.maratonajava.javacore.polimorfismo.crud.domain;

public abstract class Entity implements Crud {
    protected String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Entity(String id) {
        this.id = id;
    }
}
