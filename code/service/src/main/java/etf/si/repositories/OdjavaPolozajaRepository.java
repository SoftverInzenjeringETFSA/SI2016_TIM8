package etf.si.repositories;

import etf.si.models.OdjavaPolozaja;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Terko on 21.05.2017..
 */

@Repository
public interface OdjavaPolozajaRepository extends CrudRepository<OdjavaPolozaja, Integer> {
    public List<OdjavaPolozaja> findAll();
}