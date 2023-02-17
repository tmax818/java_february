package tyler.dojoninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import tyler.dojoninjas.models.Dojo;

public interface DojoRepository extends CrudRepository<Dojo, Long> {
    List<Dojo> findAll();
    
}
