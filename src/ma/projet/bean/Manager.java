package ma.projet.bean;

import ma.projet.Personne;

public class Manager extends Personne {
    private String service;

    public Manager(String nom, String prenom, double salaire, String service) {
        super(nom, prenom, salaire);
        this.service = service;
    }

    @Override
    public double calculerSalaire() {
        return salaire * 1.35; // ajouter 35%
    }

    @Override
    public String toString() {
        return "Le salaire du manager " + nom + " " + prenom + " est : " + calculerSalaire() + " dh, son service : " + service;
    }
}

