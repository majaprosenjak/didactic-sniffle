package si.um.feri.demo.Repozitorij;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import si.um.feri.demo.Model.Komentar;
import si.um.feri.demo.Model.*;

@Repository
public interface KomentarRepository extends CrudRepository<Komentar, Long> {
    
}
