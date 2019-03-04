package projet.classes;

public class Professeur extends Employe {
	private String specialite;
	public Professeur(int id, String nom, String prenom, Double salaire, String specialite) {
		super(id, nom, prenom, salaire);
		this.specialite=specialite;
	}


	@Override
	public String toString() {
		return  super.toString()+"Professeur [specialite=" + this.specialite + "]";
	}

	
	
}
