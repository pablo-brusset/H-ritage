package projet.classes;

public class  Etudiant  extends Personne {
	private String cne;

	public Etudiant(int id, String nom, String prenom, String cne) {
		super(id, nom, prenom);
		this.cne=cne;
	}

	

	@Override
	public String toString() {
		return  super.toString()+ "Etudiant [cne=" + cne + "]";
	}

	
	
}
