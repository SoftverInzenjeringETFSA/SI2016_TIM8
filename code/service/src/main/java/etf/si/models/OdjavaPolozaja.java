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

    @ManyToOne
    @JoinColumn(name="id_korisnika")
    private Korisnik korisnik;

    @ManyToOne
    @JoinColumn(name="id_lokacije")
    private Lokacija lokacija;
    
    private Time vrijeme_odjave;
    private Integer ispravnost_odjave;

    public OdjavaPolozaja() {

    }

    public OdjavaPolozaja(Korisnik k, Lokacija l, Time vrijeme_odjave, Integer ispravnost_odjave) {
        this.korisnik = k;
        this.lokacija = l;
        this.vrijeme_odjave = vrijeme_odjave;
        this.ispravnost_odjave = ispravnost_odjave;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Korisnik getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(Korisnik k) {
        this.korisnik = k;
    }

    public Lokacija getLokacija() {
        return lokacija;
    }

    public void setLokacija(Lokacija l) {
        this.lokacija = l;
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

