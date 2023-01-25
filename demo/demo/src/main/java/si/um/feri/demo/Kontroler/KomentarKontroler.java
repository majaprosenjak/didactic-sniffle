package si.um.feri.demo.Kontroler;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import si.um.feri.demo.Model.Komentar;
import si.um.feri.demo.Repozitorij.KomentarRepository;

@RestController
@RequestMapping("/komentar")
@CrossOrigin
public class KomentarKontroler {
    
    @Autowired
    private KomentarRepository komentarDao;

    @GetMapping("")
    public Iterable<Komentar> vrniVseKomentarje(){
        return komentarDao.findAll();
    }
    
    @GetMapping("{id}")
    public Optional<Komentar> vrniKomentar(@PathVariable(name="id") Long id) {
        return komentarDao.findById(id);
    }

    @PostMapping("")
    public Komentar dodajKomentar(@RequestBody Komentar komentar){
        return komentarDao.save(komentar);
    }
    
}
