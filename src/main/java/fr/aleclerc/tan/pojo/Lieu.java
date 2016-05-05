package fr.aleclerc.tan.pojo;

import java.util.List;

public class Lieu {
	private String codeLieu;
	private String codeArret;
	private String libelle;
	private String distance;
	private List<Ligne> ligne;
	public String getCodeLieu() {
		return codeLieu;
	}
	public void setCodeLieu(String codeLieu) {
		this.codeLieu = codeLieu;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	public List<Ligne> getLigne() {
		return ligne;
	}
	public void setLigne(List<Ligne> ligne) {
		this.ligne = ligne;
	}
	public String getCodeArret() {
		return codeArret;
	}
	public void setCodeArret(String codeArret) {
		this.codeArret = codeArret;
	}

}
