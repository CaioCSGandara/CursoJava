package academy.devdojo.maratonajava.javacore.classenum.domain;

import java.util.Date;

public class Race {
    private Date date;
    private Location location;
    private float preco;

    public Race(Date date, Location location, float preco) {
        this.date = date;
        this.location = location;
        this.preco = preco;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Race{" +
                "date=" + date +
                ", location=" + location +
                ", preco=" + preco +
                '}';
    }
}
