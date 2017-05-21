package etf.si.models;
import java.io.Serializable;
import java.sql.Time;

import javax.persistence.*;

@Entity
@Table(name="prijavapolozaja")
public class PrijavaPolozaja implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    private Integer korisnik_id;
    private Integer lokacija_id;
    private String vrsta_kontrole;
    private Time vrijeme_prijave;
    private Integer ispravnost_prijave;

    public PrijavaPolozaja () {}

    public PrijavaPolozaja(Integer id, Integer korisnik_id, Integer lokacija_id, String vrsta_kontrole, Time vrijeme_prijave, Integer ispravnost_prijave) {
        this.id = id;
        this.korisnik_id = korisnik_id;
        this.lokacija_id = lokacija_id;
        this.vrsta_kontrole = vrsta_kontrole;
        this.vrijeme_prijave = vrijeme_prijave;
        this.ispravnost_prijave = ispravnost_prijave;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getKorisnik_id() {
        return korisnik_id;
    }

    public void setKorisnik_id(Integer korisnik_id) {
        this.korisnik_id = korisnik_id;
    }

    public Integer getLokacija_id() {
        return lokacija_id;
    }

    public void setLokacija_id(Integer lokacija_id) {
        this.lokacija_id = lokacija_id;
    }

    public String getVrsta_kontrole() {
        return vrsta_kontrole;
    }

    public void setVrsta_kontrole(String vrsta_kontrole) {
        this.vrsta_kontrole = vrsta_kontrole;
    }

    public Time getVrijeme_prijave() {
        return vrijeme_prijave;
    }

    public void setVrijeme_prijave(Time vrijeme_prijave) {
        this.vrijeme_prijave = vrijeme_prijave;
    }

    public Integer getIspravnost_prijave() {
        return ispravnost_prijave;
    }

    public void setIspravnost_prijave(Integer ispravnost_prijave) {
        this.ispravnost_prijave = ispravnost_prijave;
    }
}