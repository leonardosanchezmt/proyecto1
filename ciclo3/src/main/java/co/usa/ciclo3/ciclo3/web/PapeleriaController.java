package co.usa.ciclo3.ciclo3.web;

import co.usa.ciclo3.ciclo3.model.Papeleria;
import co.usa.ciclo3.ciclo3.service.PapeleriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController   /*Recibe las peticiones del exterior*/
@RequestMapping("/api/Papeleria") /*URL mediante ests controlador puede ser alcanzado*/
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE}) /*Loas peticiones puedne venir de donde se * */
public class PapeleriaController {

    @Autowired /*Auto instanciacion*/
    private PapeleriaService papeleriaService;

    @GetMapping("/all") /*Se ejecutan ante una petición get (/api/Papeleria/all)*/
    public List<Papeleria> getPapelerias(){

        return papeleriaService.gelAll();
    }

    @GetMapping("/{id}")
    public Optional<Papeleria> getPapeleria(@PathVariable("id") int id){/*Indica la ruta*/

        return papeleriaService.getPapeleria(id);

    }


    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Papeleria save(@RequestBody Papeleria p){ /*Request pone la peticion del post*/

        return papeleriaService.save(p);
    }

}
