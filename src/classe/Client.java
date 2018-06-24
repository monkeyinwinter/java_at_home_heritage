package classe;

public class Client extends User {

    public Client(String nom, String prenom) {
        super(nom, prenom);
    }

    @Override
    public String toString() {
        int role = 4;
        return super.toString() + "    Mon niveau de droit est : " + role;

    }
}
