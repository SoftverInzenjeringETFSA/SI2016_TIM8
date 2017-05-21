package etf.si.models;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;

/**
 * Created by Terko on 21.05.2017..
 */

@Entity
@Table(name="odjavapolozaja")
public class OdjavaPolozaja implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    private Integer korisnik_id;
    private Integer lokacija_id;
    private Time vrijeme_odjave;
    private Integer ispravnost_odjave;

    public OdjavaPolozaja() {

    }

    public OdjavaPolozaja(Integer korisnik_id, Integer lokacija_id, Time vrijeme_odjave, Integer ispravnost_odjave) {
        this.korisnik_id = korisnik_id;
        this.lokacija_id = lokacija_id;
        this.vrijeme_odjave = vrijeme_odjave;
        this.ispravnost_odjave = ispravnost_odjave;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getKorisnikID() {
        return korisnik_id;
    }

    public void setKorisnikID(Integer korisnik_id) {
        this.korisnik_id = korisnik_id;
    }

    public Integer getLokacijaID() {
        return lokacija_id;
    }

    public void setLokacijaID(Integer lokacija_id) {
        this.lokacija_id = lokacija_id;
    }

    public Time getVrijemeOdjave() {
        return vrijeme_odjave;
    }

    public void setVrijemeOdjave(Time vrijeme_odjave) {
        this.vrijeme_odjave = vrijeme_odjave;
    }

    public Integer getIspravnostOdjave() {
        return ispravnost_odjave;
    }

    public void setIspravnostOdjave(Integer ispravnost_odjave) {
        this.ispravnost_odjave = ispravnost_odjave;
    }
}

