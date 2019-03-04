package projet.tests;

import projet.classes.Employe;
import projet.classes.Etudiant;
import projet.classes.Professeur;

public class Application {

	public static void main(String[] args) {
		Etudiant etu1= new Etudiant(1, "Druelle", "Mehdi", "65678754");
		System.out.println(etu1);
		Etudiant etu2= new Etudiant(2, "Tsoukalas","Ioanna","87543543");
		System.out.println(etu2);
		Employe emp1=new Employe(1, "San Martino", "Kevin",5000.0);
		System.out.println(emp1);
		Employe emp2=new Employe(2, "Cougrand", "Thibault",5000.0);
		System.out.println(emp2);
		Professeur prof1=new Professeur(1, "Pourcelot", "Sabrina",2000.0, "Java/JEE");
		System.out.println(prof1);
		Professeur prof2=new Professeur(2, "Brusset", "Pablo",1800.0, "Mathematique");
		System.out.println(prof2);
	}

}
