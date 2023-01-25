package si.um.feri.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Komentar {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String naslov;
	private String vsebina;

    public Komentar(){}

    public Komentar (String naslov, String vsebina){
        this.naslov = naslov;
        this.vsebina = vsebina;
    }

    public Long getId(){
        return this.id;
    }

	public void setId(Long id){
        this.id = id;
    }

	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}

	public String getNaslov() {
		return this.naslov;
	}

	public void setVsebina(String vsebina) {
		this.vsebina = vsebina;
	}

	public String getVsebina() {
		return this.vsebina;
	}
}
