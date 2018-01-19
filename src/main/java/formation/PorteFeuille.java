package formation;

public abstract class PorteFeuille {
	private String libelle = "Défaut";
	private String nomBanque = "Défaut";

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getNomBanque() {
		return nomBanque;
	}

	public void setNomBanque(String nomBanque) {
		this.nomBanque = nomBanque;
	}
}
