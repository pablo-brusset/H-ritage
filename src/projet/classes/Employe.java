package projet.classes;

public class Employe extends Personne {
	private double salaire;
	public Employe(int id, String nom, String prenom, Double salaire) {
		super(id, nom, prenom);
		this.salaire=salaire;
		
	}

	

	@Override
	public String toString() {
		return  super.toString()+"Employe [salaire=" + this.salaire + "]";
	}

	

	
	
}
