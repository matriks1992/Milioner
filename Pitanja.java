package Milioner_igrica;

public class Pitanja {

	private String pitanje;
	private String prviOdg;
	private String drugiOdg;
	private String treciOdg;
	private String cetvrtiOdg;
	
	public Pitanja(String pitanje, String prviOdg, String drugiOdg,
			String treciOdg, String cetvrtiOdg) {
		this.pitanje = pitanje;
		this.prviOdg = prviOdg;
		this.drugiOdg = drugiOdg;
		this.treciOdg = treciOdg;
		this.cetvrtiOdg = cetvrtiOdg;
	}

	public String getPitanje() {
		return pitanje;
	}

	public String getPrviOdg() {
		return prviOdg;
	}

	public String getDrugiOdg() {
		return drugiOdg;
	}

	public String getTreciOdg() {
		return treciOdg;
	}

	public String getCetvrtiOdg() {
		return cetvrtiOdg;
	}
	
	
}
