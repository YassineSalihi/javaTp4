package ma.projet.bean;

import ma.projet.Personne;

public class Developpeur extends Personne {
    private String specialite;

    public Developpeur(String nom, String prenom, double salaire, String specialite) {
        super(nom, prenom, salaire);
        this.specialite = specialite;
    }

    @Override
    public double calculerSalaire() {
        return salaire * 1.2; // anzido 20%
    }

    @Override
    public String toString() {
        return "Le salaire du développeur " + nom + " " + prenom + " est : " + calculerSalaire() + " dh, sa spécialité : " + specialite;
    }
}
