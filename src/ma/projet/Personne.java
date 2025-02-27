package ma.projet;

public abstract class Personne {
    protected String nom;
    protected String prenom;
    protected double salaire;

    public Personne(String nom, String prenom, double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
    }

    public abstract double calculerSalaire();

    @Override
    public String toString() {
        return "Nom : " + nom + ", Prénom : " + prenom + ", Salaire : " + calculerSalaire();
    }
}
