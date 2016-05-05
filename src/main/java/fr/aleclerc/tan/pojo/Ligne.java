package fr.aleclerc.tan.pojo;

public class Ligne {
	private String numLigne;
	private Integer typeLigne;
	private String directionSens1;
	private String directionSens2;
	private String accessible;
	private String etatTrafic;
	private String libelleTrafic;
	
	public String getNumLigne() {
		return numLigne;
	}

	public void setNumLigne(String numLigne) {
		this.numLigne = numLigne;
	}

	public Integer getTypeLigne() {
		return typeLigne;
	}

	public void setTypeLigne(Integer typeLigne) {
		this.typeLigne = typeLigne;
	}

	public String getDirectionSens1() {
		return directionSens1;
	}

	public void setDirectionSens1(String directionSens1) {
		this.directionSens1 = directionSens1;
	}

	public String getDirectionSens2() {
		return directionSens2;
	}

	public void setDirectionSens2(String directionSens2) {
		this.directionSens2 = directionSens2;
	}

	public String getAccessible() {
		return accessible;
	}

	public void setAccessible(String accessible) {
		this.accessible = accessible;
	}

	public String getEtatTrafic() {
		return etatTrafic;
	}

	public void setEtatTrafic(String etatTrafic) {
		this.etatTrafic = etatTrafic;
	}

	public String getLibelleTrafic() {
		return libelleTrafic;
	}

	public void setLibelleTrafic(String libelleTrafic) {
		this.libelleTrafic = libelleTrafic;
	}

}
