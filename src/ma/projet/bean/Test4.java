package ma.projet.bean;

import ma.projet.bean.Developpeur;
import ma.projet.bean.Manager;

public class Test4 {
	public static void main(String[] args) {
		Developpeur dev1 = new Developpeur("Salim", "Karim", 10000, "PHP");
		Developpeur dev2 = new Developpeur("Ahmed", "Ali", 12000, "Java");
		Manager man1 = new Manager("LACHGAR", "Mohamed", 30000, "Informatique");
		Manager man2 = new Manager("BENNANI", "Omar", 35000, "Finance");

		System.out.println(dev1);
		System.out.println(dev2);
		System.out.println(man1);
		System.out.println(man2);

		// Tentative de création d'un objet de type Personne
		// Personne p = new Personne("Test", "User", 20000); //
		// *************************************************
		// une classe abstraite ne peut pas être instanciée
		// **************************************************
	}
}
