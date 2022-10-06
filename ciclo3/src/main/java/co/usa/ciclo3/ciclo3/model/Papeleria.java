package co.usa.ciclo3.ciclo3.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Papeleria") /*hacemos que la clase sea una tabla*/
public class Papeleria implements Serializable {/*para pasar la información poro aca se hjace serializable*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)/*genera un auto incremento*/
    private Integer id;
    private String name;
    private Integer price;
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
