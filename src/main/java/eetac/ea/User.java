package eetac.ea;

public class User {
    private String idUser;
    private String nom;

    public User() {

    }

    public User(String idUser, String nom ) {
        this.idUser=idUser;
        this.nom=nom;
    }
    public String getNom(){
        return this.nom;
    }
    public void setNom(String n){
        this.nom=n;
    }
}
