package academy.devdojo.maratonajava.javacore.polimorfismo.crud.domain;

public class Product extends Entity{
    protected String name;
    protected String description;
    protected float price;

    public Product(String id, String name, String description, float price) {
        super(id);
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override

    public void get() {
        System.out.println("GET dados do produto");
    }

    @Override

    public void getById(String id) {
        System.out.println("GET dados para o produto:" + id);
    }

    public void post(Entity e) {
        Product p = (Product) e;
        System.out.println("Adicionando produto: " + p.getName());
    }

    @Override
    public void put(Entity e) {
        Product p = (Product) e;
        System.out.println("Atualizando produto: " + p.getName());
    }

    @Override
    public void delete(String id) {
        System.out.println("Deletando produto de id: " + id);
    }
}
