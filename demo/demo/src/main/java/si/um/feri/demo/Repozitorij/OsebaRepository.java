package si.um.feri.demo.Repozitorij;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import si.um.feri.demo.Model.Oseba;

@Repository
public interface OsebaRepository extends CrudRepository <Oseba, Long> {
    
}
