package si.um.feri.demo.Kontroler;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import si.um.feri.demo.Model.Oseba;
import si.um.feri.demo.Repozitorij.OsebaRepository;

@RestController
@RequestMapping("/oseba")
@CrossOrigin
public class OsebaKontroler {

    @Autowired
    private OsebaRepository osebaDao;

    @GetMapping("")
    public Iterable<Oseba> vrniVseOsebe() {
        return osebaDao.findAll();
    }

    @GetMapping("{id}")
    public Optional<Oseba> vrniOsebo(@PathVariable(name="id") Long id) {
        return osebaDao.findById(id);
    }

    @PostMapping("")
    public Oseba dodajOsebo(@RequestBody Oseba oseba){
        return osebaDao.save(oseba);
    }
}
