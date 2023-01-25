package si.um.feri.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Oseba {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String ime;
    private String priimek;
    private String email;

    public Oseba() {}

    public Oseba(String ime, String priimek, String email) {
        this.email = email;
        this.ime = ime;
        this.priimek = priimek;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPriimek() {
        return priimek;
    }

    public void setPriimek(String priimek) {
        this.priimek = priimek;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
