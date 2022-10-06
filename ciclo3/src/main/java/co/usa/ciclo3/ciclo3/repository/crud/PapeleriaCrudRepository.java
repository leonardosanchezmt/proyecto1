package co.usa.ciclo3.ciclo3.repository.crud;

import co.usa.ciclo3.ciclo3.model.Papeleria;
import org.springframework.data.repository.CrudRepository;

public interface PapeleriaCrudRepository extends CrudRepository<Papeleria, Integer> {/*Hereda de otra interfaz propia de spring*/
    /*es uncomponenete que gestiona la BD actualización, borrado etc.*/


}
