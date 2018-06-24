package classe;

public class User {
    protected int id;
    protected String nom;
    protected String prenom;

    private static int count;

    public User(String nom, String prenom) {
        this.id = ++count;
        this.nom = nom;
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "id : " + id + "    Nom : " + this.nom.toUpperCase() + "    Prénom : " + this.prenom.substring(0, 1).toUpperCase() + "" + this.prenom.substring(1).toLowerCase();
    }
}



