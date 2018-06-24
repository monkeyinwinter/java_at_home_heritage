package classe;

public class Admin2 extends User {

    public Admin2(String nom, String prenom) {
        super(nom, prenom);

    }

    @Override
    public String toString() {
        int role = 1;
        return super.toString() + "    Mon niveau de droit est : " + role;
    }

}