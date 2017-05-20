package etf.unsa.repositories;
import etf.unsa.models.Korisnik;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Lejla on 20/05/2017.
 */

public interface KorisnikRepository extends CrudRepository<Korisnik, Integer>{

    public Korisnik findByID(Integer id);

    public Korisnik findByFullName(String ime, String prezime);

    public Korisnik findByEmail(String email);

    public Korisnik findByUsername(String username);
}
