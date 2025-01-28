package academy.devdojo.maratonajava.javacore.polimorfismo.crud.domain;

public class User extends Entity{
    protected String name;
    protected String email;

    public User(String name, String email, String id) {
        super(id);
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override

    public void get() {
        System.out.println("GET dados do usuário");
    }

    @Override

    public void getById(String id) {
        System.out.println("GET dados para o usuário:" + id);
    }

    public void post(Entity e) {
        User u = (User)e;
        System.out.println("Adicionando usuário: " + u.getName());
    }

    @Override
    public void put(Entity e) {
        User u = (User)e;
        System.out.println("Atualizando usuário: " + u.getName());
    }

    @Override
    public void delete(String id) {
        System.out.println("Deletando usuário de id: " + id);
    }
}
