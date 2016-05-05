package fr.aleclerc.tan.pojo;

public class Attente {
	private Integer sens;
	private String terminus;
	private Boolean infotrafic;
	private String temps;
	private Ligne ligne;
	private Arret arret;
	public Integer getSens() {
		return sens;
	}
	public void setSens(Integer sens) {
		this.sens = sens;
	}
	public String getTerminus() {
		return terminus;
	}
	public void setTerminus(String terminus) {
		this.terminus = terminus;
	}
	public Boolean getInfotrafic() {
		return infotrafic;
	}
	public void setInfotrafic(Boolean infotrafic) {
		this.infotrafic = infotrafic;
	}
	public String getTemps() {
		return temps;
	}
	public void setTemps(String temps) {
		this.temps = temps;
	}
	public Ligne getLigne() {
		return ligne;
	}
	public void setLigne(Ligne ligne) {
		this.ligne = ligne;
	}
	public Arret getArret() {
		return arret;
	}
	public void setArret(Arret arret) {
		this.arret = arret;
	}

}
