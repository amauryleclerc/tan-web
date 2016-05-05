package fr.aleclerc.tan.pojo;

import java.util.List;

public class Horaire {
	private String heure;
	private List<String> passages;
	public String getHeure() {
		return heure;
	}
	public void setHeure(String heure) {
		this.heure = heure;
	}
	public List<String> getPassages() {
		return passages;
	}
	public void setPassages(List<String> passages) {
		this.passages = passages;
	}


}
