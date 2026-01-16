public abstract class Personnage {

    protected  String nom;
    private String type;
    private  int pointDeVie;



    public Personnage(String nom,String type,int pointDeVie){
        this.nom = nom;
        this.pointDeVie = pointDeVie;
    }

    public String getNom(){
        return nom;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public String getType(){
        return this.type;
    }


    public void setType(String type){
        this.type = type;
    }

    public int getPointDeVie(){
        return this.pointDeVie;
    }

    public void setPointDeVie(int pointDeVie){
        this.pointDeVie = pointDeVie;
    }


}
