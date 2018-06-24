package classe;

public class Commercial extends User {

    public Commercial(String nom, String prenom) {
        super(nom, prenom);
    }

    @Override
    public String toString() {
        int role = 3;
        return super.toString() + "    Mon niveau de droit est : " + role;

    }
}
