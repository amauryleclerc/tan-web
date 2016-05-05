package fr.aleclerc.tan.pojo;

import java.util.List;

public class Horaires {
	private Arret arret;
	private List<Attente> prochainsParcours;
	private Ligne ligne;
	private String codeCouleur;
	private String plageDeService;
	private List<Horaire> horaires;
	private List<Horaire> prochainsHoraires;
	private List<Note> notes;
	public Arret getArret() {
		return arret;
	}
	public void setArret(Arret arret) {
		this.arret = arret;
	}
	public List<Attente> getProchainsParcours() {
		return prochainsParcours;
	}
	public void setProchainsParcours(List<Attente> prochainsParcours) {
		this.prochainsParcours = prochainsParcours;
	}
	public Ligne getLigne() {
		return ligne;
	}
	public void setLigne(Ligne ligne) {
		this.ligne = ligne;
	}
	public String getCodeCouleur() {
		return codeCouleur;
	}
	public void setCodeCouleur(String codeCouleur) {
		this.codeCouleur = codeCouleur;
	}
	public String getPlageDeService() {
		return plageDeService;
	}
	public void setPlageDeService(String plageDeService) {
		this.plageDeService = plageDeService;
	}
	public List<Horaire> getHoraires() {
		return horaires;
	}
	public void setHoraires(List<Horaire> horaires) {
		this.horaires = horaires;
	}
	public List<Horaire> getProchainsHoraires() {
		return prochainsHoraires;
	}
	public void setProchainsHoraires(List<Horaire> prochainsHoraires) {
		this.prochainsHoraires = prochainsHoraires;
	}
	public List<Note> getNotes() {
		return notes;
	}
	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}
	
	
}
