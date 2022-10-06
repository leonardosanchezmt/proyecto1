package co.usa.ciclo3.ciclo3.repository;

import co.usa.ciclo3.ciclo3.model.Papeleria;
import co.usa.ciclo3.ciclo3.repository.crud.PapeleriaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository /*permite las transacciones con las base de datos*/
public class PapeleriaRepository {

    @Autowired /*inicializa el objeto*/
    private PapeleriaCrudRepository papeleriaCrudRepository;
    public List<Papeleria> getAll(){
        return (List<Papeleria>) papeleriaCrudRepository.findAll();
    }
    public Optional<Papeleria> getPapeleria(int id) { /*metodo*/
        return papeleriaCrudRepository.findById(id);
    }  /*Si no hay info devuelve null el optional permite entregar un mensaje de no encontro nada*/

    public Papeleria save(Papeleria p){
        return papeleriaCrudRepository.save(p);
    }

}
